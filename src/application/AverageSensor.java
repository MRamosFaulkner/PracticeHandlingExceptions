package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private boolean isOn;
    private List<Integer> readings;

    public AverageSensor() {
        sensors = new ArrayList<>();
        isOn = false;
        readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public int read() {
        if (!isOn || sensors.isEmpty()) {
            throw new IllegalStateException("Sensor is off non added")
        }

        int sum = 0;
        for (Sensor sensor : sensors) {
            int reading = sensor.read();
            readings.add(reading);
            sum += reading;
        }
        return sum / sensors.size();
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn() {
        boolean allSensorsOn = true;
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                allSensorsOn = false;
                break;
            }
        }
        isOn = allSensorsOn;
    }

    public void setOff() {
        isOn = false;
    }

    public List<Integer> readings() {
        return new ArrayList<>(readings);
    }

}
