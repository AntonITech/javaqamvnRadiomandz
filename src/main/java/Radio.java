public class Radio {

    // РАДИОВОЛНЫ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public int currentRadioStationNumb;  //Номер текущей радиостанции

    public int getCurrentRadioStationNumb() {
        return currentRadioStationNumb;
    }

    public void setToMaxNumbStation() {
        currentRadioStationNumb = 9;
    }

    public void setCurrentRadioStationNumb(int newCurrentRadioStationNumb) {
        if (newCurrentRadioStationNumb < 0) {
            newCurrentRadioStationNumb = 9;
        }
        if (newCurrentRadioStationNumb > 9) {
            newCurrentRadioStationNumb = 0;
        }
        if (newCurrentRadioStationNumb < 0) {
            newCurrentRadioStationNumb = newCurrentRadioStationNumb + 1;
        }
        if (newCurrentRadioStationNumb > 9) {
            newCurrentRadioStationNumb = newCurrentRadioStationNumb - 1;
        }
        currentRadioStationNumb = newCurrentRadioStationNumb;
    }

    public void setCurrentRadioStationNumbMinMax() {

        if (currentRadioStationNumb < 0) {
            //currentRadioStationNumb = 9;
        }
        if (currentRadioStationNumb > 9) {
            currentRadioStationNumb = 0;
        }
        currentRadioStationNumb = currentRadioStationNumb;
    }

    // Громкость звука!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public int currentVolume;

    public void setMaxVolume() {
        currentVolume = 10;
    }

    public int getCurrentVolume() {
        return currentVolume;
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
