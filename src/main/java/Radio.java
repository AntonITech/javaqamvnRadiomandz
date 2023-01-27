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

    public void setToMinNumbStation() {
        currentRadioStationNumb = 0;
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

    public void nextRadioStation() {     //new version
        int target = currentRadioStationNumb + 1;
        setCurrentRadioStationRangeLimit(target);
    }

    public void prevRadioStation() {     //new version
        int target = currentRadioStationNumb - 1;
        setCurrentRadioStationRangeLimit(target);
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
