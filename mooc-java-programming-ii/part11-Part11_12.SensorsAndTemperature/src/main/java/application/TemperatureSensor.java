/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author lalutoww
 */
public class TemperatureSensor implements Sensor{
    private boolean turnedOn;

    public TemperatureSensor() {
        turnedOn = false;
    }
    
    
    @Override
    public boolean isOn() {
        return turnedOn;
    }

    @Override
    public void setOn() {
        this.turnedOn = true;
    }

    @Override
    public void setOff() {
        this.turnedOn = false;
    }

    @Override
    public int read() {
        if(!isOn()){
            throw new IllegalStateException();
        }
        
        Random rand = new Random();
        int number = rand.nextInt(61) - 30;
        
        return number;
    }
    
}
