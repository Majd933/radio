package radio;

public class Main {

    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setStatusOn();
        radio.setFrequency(265);
        radio.setVolume(46);
        radio.setChannelName("Der erste Radio");
        // radio.setStatusOff();
        radio.printStatusInfo();
    }

}
