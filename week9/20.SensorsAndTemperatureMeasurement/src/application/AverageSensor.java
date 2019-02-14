/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author timmyjing
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }
    
    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {
        if (sensors.isEmpty()) return false;
        boolean isOn = true;
        
        for (Sensor sensor: sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return isOn;
    }

    @Override
    public void on() {
        for (Sensor sensor: sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor: sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if (!isOn()) throw new IllegalStateException("Sensor is off");
        
        int sum = 0;
        
        for (Sensor sensor: sensors) {
            sum += sensor.measure();
        }
        
        int result = sum / sensors.size();
        
        readings.add(result);
        
        return result;
    }
    
}
