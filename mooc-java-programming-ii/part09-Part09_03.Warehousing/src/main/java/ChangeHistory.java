
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalutoww
 */
public class ChangeHistory {
    private ArrayList<Double> list;

    public ChangeHistory() {
        this.list = new ArrayList<>();
    }
    
    public void add(double status){
        this.list.add(status);
    }
    
    public void clear(){
        this.list.clear();
    }
    
    public double maxValue(){
        if(this.list.isEmpty()){
            return 0;
        }
        
        Double maxValue = Double.NEGATIVE_INFINITY;
        for(Double value : this.list){
            if(value > maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }
    
    public double minValue(){
        if(this.list.isEmpty()){
            return 0;
        }
        
        Double minValue = Double.POSITIVE_INFINITY;
        for(Double value : this.list){
            if(value < minValue){
                minValue = value;
            }
        }
        return minValue;
    }
    
    public double average(){
        if(this.list.isEmpty()){
            return 0;
        }
        
        double sum = 0;
        for(Double value : this.list){
            sum+=value;
        }
        return sum / this.list.size();
    }
    
    @Override
    public String toString() {
        return this.list.toString();
    }
    
}
