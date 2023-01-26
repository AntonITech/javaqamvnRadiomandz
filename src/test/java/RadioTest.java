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
    public void shouldSetRadioStationNumbOutsideMaxLimit() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(10);

        int expected = 0;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationNumbOutsideMinLimit() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(-2);

        int expected = 9;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumbPrev() {
        Radio radstation = new Radio();

        radstation.shouldCurrentRadioStationPrev(-2);

        radstation.setCurrentRadioStationNumb();

        int expected = 9;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNextNumb() {
        Radio radstation = new Radio();

        radstation.shouldCurrentRadioStationNext(12);

        radstation.setCurrentRadioStationNumb();

        int expected = 0;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumbBelowMin() {
        Radio radstation = new Radio();

        radstation.shouldCurrentRadioStationPrev(-2);

        radstation.setCurrentRadioStationNumb();

        int expected = 9;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumbIsMin() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(0);

        radstation.setCurrentRadioStationNumb();

        int expected = 0;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumbValidMin() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(1);

        radstation.setCurrentRadioStationNumb();

        int expected = 1;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumbAboveMax() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(10);

        radstation.setCurrentRadioStationNumb();

        int expected = 0;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumbIsMax() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(9);

        radstation.setCurrentRadioStationNumb();

        int expected = 9;
        int actual = radstation.getCurrentRadioStationNumb();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationValidNumb() {
        Radio radstation = new Radio();

        radstation.setCurrentRadioStationRangeLimit(8);

        radstation.setCurrentRadioStationNumb();

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
    public void shouldSetVolumeIsMax() {
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
    public void shouldSetVolumeIsMin() {
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
    public void shouldDecreaseVolumeOnOneValidValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);

        radio.decreaseVolumeOnOne();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
