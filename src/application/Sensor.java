package application;

public interface Sensor {

    int read();
    boolean isOn();
    void setOn();
    void setOff();
}
