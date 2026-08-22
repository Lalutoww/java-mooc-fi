/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author lalutoww
 */
public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;
    

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    @Override
    public boolean isOn() {
        return this.sensors.stream().filter(x -> x.isOn() == false).count() == 0;
    }

    @Override
    public void setOn() {
        for(Sensor s : this.sensors){
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        this.sensors.get(0).setOff();
    }

    @Override
    public int read() {
        if(!isOn() || this.sensors.isEmpty()){
            throw new IllegalStateException();
        }
        
        int average = (int) this.sensors.stream().mapToInt(x -> x.read()).average().getAsDouble();
        
        this.readings.add(average);
        return average;
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
}
