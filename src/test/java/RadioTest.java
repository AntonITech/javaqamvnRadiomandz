import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNumbStation() {
        Radio radstation = new Radio(10);

        radstation.setCurrentRadioStationRangeLimit(10);

        int expected = 0;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxNumbStation() {
        Radio radstation = new Radio(10);

        radstation.setCurrentRadioStationRangeLimit(9);

        int expected = 9;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxNumbStation() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(10);

        int expected = 0;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinNumbStation() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(-1);

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

        radstation.setCurrentRadioStationRangeLimit(7);

        radstation.nextRadioStation();

        int expected = 8;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinStation() {
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

        radstation.setCurrentRadioStationRangeLimit(9);

        radstation.prevRadioStation();

        int expected = 8;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMaxStation() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(-1);

        radstation.prevRadioStation();

        int expected = 9;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

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

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeEqualMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
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
    public void shouldVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.increaseVolumeOnOne();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);

        radio.increaseVolumeOnOne();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolumeOnOne();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolumeOnOne();

        int expected = 100;
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
    public void shouldPrevVolumeOnOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);

        radio.decreaseVolumeOnOne();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
