package radio;

public class Radio {
    private RadioState status;
    private int volume;
    private double frequency;
    private String channelName;

    public Radio() {
        this.status = Radio.RadioState.OFF;
        this.volume = 0;
        this.frequency = 20.0;
        this.channelName = null;
    }

    public RadioState getStatus() {
        return this.status;
    }

    // Das Radio wird eingeschaltet, wenn es ausgeschaltet ist.
    public void setStatusOn() {
        if (isOn()) {
            System.out.println(" Das Radio ist bereits eingeschaltet ");
        } else {
            this.status = Radio.RadioState.ON;
        }

    }

    // Das Radio wird ausgeschaltet, wenn es eingeschaltet ist.
    public void setStatusOff() {
        if (!isOn()) {
            System.out.println(" Das Radio ist bereits ausgeschaltet ");
        } else {
            this.status = Radio.RadioState.OFF;
        }

    }

    public double getVolume() {
        return (double) this.volume;
    }

    // Die Lautstärke wird aktualisiert, wenn die Lautstärke zwischen 0 und 100
    // liegt und das Radio eingeschaltet ist.
    public void setVolume(int volume) {
        if (isOn()) {

            if (volume <= 100 && volume >= 0) {
                this.volume = volume;
            } else {
                System.out.println(" Error, der Lautstärke muss zwischen 0 und 100 liegen ");
            }

        }
    }

    public double getFrequency() {
        return this.frequency;
    }

    // Die Frequenz wird aktualisiert, wenn die Frequenz zwischen 20 und 300 liegt
    // und das Radio eingeschaltet ist.
    public void setFrequency(double frequency) {
        if (isOn()) {
            if ((frequency < 300.0) && (frequency > 20.0)) {
                this.frequency = frequency;
            } else {
                System.out.println(" Error, die Frequenz muss zwischen 20 und 300 liegen ");
            }

        }
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    // Die Informationen werden ausgedruckt, , Wenn das Radio eingeschaltet ist.
    public void printStatusInfo() {
        if (isOn()) {
            System.out.println(" Das Radio ist ein ");
            System.out.println(" Der Lautstärke ist : " + this.volume);
            System.out.println(" Die Frequenz ist : " + this.frequency);
            System.out.println(" Der Kanalname ist : " + this.channelName);

        } else {
            System.out.println(" Das Radio ist aus ");
        }
    }

    public static enum RadioState {
        ON, OFF;

        private RadioState() {
        }
    }

    // Überprüfen das Radio Status
    public boolean isOn() {
        if (this.status == RadioState.ON)
            return true;

        return false;
    }

}
