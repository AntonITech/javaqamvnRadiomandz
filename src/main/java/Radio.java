public class Radio {
    private int currentRadioStationNumb;  //Номер текущей радиостанции
    private int currentVolume;            //уровень звука

    public int getCurrentRadioStationNumb() {
        return currentRadioStationNumb;
    }

    public void setCurrentRadioStationRangeLimit(int newCurrentRadioStationNumb) {
        if (newCurrentRadioStationNumb < 0) {
            return;
        }
        if (newCurrentRadioStationNumb > 9) {
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
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStationNumb != 9) {
            currentRadioStationNumb++;
        } else {
            currentRadioStationNumb = 0;
        }
    }

    public void prevRadioStation() {
       if (currentRadioStationNumb != 0) {
           currentRadioStationNumb --;
       } else {
           currentRadioStationNumb = 9;
       }
    }

    public void increaseVolumeOnOne() {
        if (currentVolume != 10) {
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
