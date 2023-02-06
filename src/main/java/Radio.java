public class Radio {
    private int currentRadioStationNumb;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int quantityStations) {
        maxStation = quantityStations - 1;
    }

    public int getCurrentRadioStationNumb() {
        return currentRadioStationNumb;
    }

    public void setCurrentRadioStationRangeLimit(int newCurrentRadioStationNumb) {
        if (newCurrentRadioStationNumb < 0) {
            return;
        }
        if (newCurrentRadioStationNumb > maxStation) {
            return;
        }
        currentRadioStationNumb = newCurrentRadioStationNumb;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStationNumb != maxStation) {
            currentRadioStationNumb++;
        } else {
            currentRadioStationNumb = 0;
        }
    }

    public void prevRadioStation() {
       if (currentRadioStationNumb != 0) {
           currentRadioStationNumb --;
       } else {
           currentRadioStationNumb = maxStation;
       }
    }

    public void increaseVolumeOnOne() {
        if (currentVolume != 100) {
            currentVolume ++;
        } else {
            return;
        }
    }

    public void decreaseVolumeOnOne() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            return;
        }
    }
}
