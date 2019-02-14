/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.Random;

/**
 *
 * @author timmyjing
 */
public class Thermometer implements Sensor{
    private boolean isOn;
    
    public Thermometer() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void on() {
        if (isOn) return;
        
        isOn = true;
    }

    @Override
    public void off() {
        isOn = false;
    }

    @Override
    public int measure() {
        if (!isOn) throw new IllegalStateException("Sensor not on.");
        
        int random = new Random().nextInt(61);
        return -30 + random;
    }
    
}
