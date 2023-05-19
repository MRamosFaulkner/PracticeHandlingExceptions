package application;

public class StandardSensor implements Sensor {

    private final init value;

    public StandardSensor(int value) {
        this.value = value;
    }
    public int read() {
        return value;
    }
    public boolean isOn() {
        return true;
    }

    public void setOn() {

    }

    public setOff() {

    }
}
