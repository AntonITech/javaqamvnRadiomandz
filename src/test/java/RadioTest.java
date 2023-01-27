import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //!!!!!!!!!!!!!!!!!! ТЕСТЫ НА ПЕРЕКЛЮЧЕНИЕ РАДИОВОЛН  !!!!!!!!!!!!!!!!!
    @Test
    public void shouldSetToMaxNumbStation() {
        Radio radstation = new Radio();

        radstation.setToMaxNumbStation();

        int expected = 9;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinNumbStation() {
        Radio radstation = new Radio();

        radstation.setToMinNumbStation();

        int expected = 0;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationNumbAboveMax() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(11);

        int expected = 0;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationNumbBelowMin() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(-1);

        int expected = 9;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationNumbEqualMax() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(9);

        int expected = 9;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationNumbEqualMin() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(0);

        int expected = 0;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationNumb() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(9);

        radstation.nextRadioStation();

        int expected = 0;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationNumb() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(0);

        radstation.prevRadioStation();

        int expected = 9;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationNumbValidMin() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(1);

        radstation.setCurrentRadioStationNumb();

        int expected = 1;
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
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.setMaxVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(12);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeEqualMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-2);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeEqualMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        radio.increaseVolumeOnOne();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOnOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        radio.increaseVolumeOnOne();

        int expected = 9;
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
    public void shouldDecreaseVolumeValidValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);

        radio.decreaseVolumeOnOne();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
