public class Radio {

    private int currentRadioStationNumb;  //Номер текущей радиостанции

    private int currentVolume;            //уровень звука

    public int getCurrentRadioStationNumb() {
        return currentRadioStationNumb;
    }

    public void setCurrentRadioStationNumb() {
        currentRadioStationNumb = currentRadioStationNumb;
    }

    public void setToMaxNumbStation() {
        currentRadioStationNumb = 9;
    }

    public void setCurrentRadioStationRangeLimit(int newCurrentRadioStationNumb) {
        if (newCurrentRadioStationNumb < 0) {
            newCurrentRadioStationNumb = 9;
        }
        if (newCurrentRadioStationNumb > 9) {
            newCurrentRadioStationNumb = 0;
        }
        currentRadioStationNumb = newCurrentRadioStationNumb;
    }

    public void shouldCurrentRadioStationPrev(int newCurrentRadioStationNumbPrev) {
        if (newCurrentRadioStationNumbPrev < 0) {
            newCurrentRadioStationNumbPrev = newCurrentRadioStationNumbPrev + 1;
        }
        if (newCurrentRadioStationNumbPrev < 0) {
            newCurrentRadioStationNumbPrev = 9;
        }
        currentRadioStationNumb = newCurrentRadioStationNumbPrev;
    }

    public void shouldCurrentRadioStationNext(int newCurrentRadioStationNumbNext) {
        if (newCurrentRadioStationNumbNext > 9) {
            newCurrentRadioStationNumbNext = newCurrentRadioStationNumbNext - 1;
        }
        if (newCurrentRadioStationNumbNext > 9) {
            newCurrentRadioStationNumbNext = 0;
        }
        currentRadioStationNumb = newCurrentRadioStationNumbNext;
    }

    // Громкость звука!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setMaxVolume() {
        currentVolume = 10;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolumeOnOne() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolumeOnOne() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
