import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //!!!!!!!!!!!!!!!!!! ТЕСТЫ НА ПЕРЕКЛЮЧЕНИЕ РАДИОВОЛН  !!!!!!!!!!!!!!!!!
    @Test
    public void shouldSetRadioStationNumb() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationNumb(8);

        int expected = 8;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxNumbStation() {
        Radio radstation = new Radio();

        radstation.setToMaxNumbStation();

        int expected = 9;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumbBelowMin() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationNumb(-1);

        radstation.setCurrentRadioStationNumbMinMax();

        int expected = 9;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumbIsMin() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationNumb(0);

        radstation.setCurrentRadioStationNumbMinMax();

        int expected = 0;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumbValidMin() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationNumb(1);

        radstation.setCurrentRadioStationNumbMinMax();

        int expected = 1;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumbAboveMax() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationNumb(10);

        radstation.setCurrentRadioStationNumbMinMax();

        int expected = 0;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumbIsMax() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationNumb(9);

        radstation.setCurrentRadioStationNumbMinMax();

        int expected = 9;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumbValidMax() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationNumb(8);

        radstation.setCurrentRadioStationNumbMinMax();

        int expected = 8;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    //!!!!!!!!!!!    ТЕСТЫ НА ГРОМКОСТЬ ЗВУКА     !!!!!!!!!!!!!!!!!!!!!!
    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIsMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIsMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.setMaxVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOnOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);


        radio.increaseVolumeOnOne();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOnOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        radio.decreaseVolumeOnOne();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIsOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.decreaseVolumeOnOne();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}