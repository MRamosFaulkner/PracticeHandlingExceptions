package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    public boolean isOn;
    public Random random;

    public TemperatureSensor() {
        isOn = false;
        random = new Random();
    }

    public int read() {
        if (!isOn) {
            throw new IllegalStateException("The sensor is on.")
        }

        return random.nextInt(61) - 30;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn() {
        isOn = true;
    }

    public void setOff() {
        isOn = false;
    }
}
