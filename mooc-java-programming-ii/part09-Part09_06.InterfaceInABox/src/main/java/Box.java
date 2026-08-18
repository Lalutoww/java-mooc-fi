
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
public class Box implements Packable{
    private double maximumCapacity;
    private ArrayList<Packable> items;

    public Box(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item){
        if(this.maximumCapacity - item.weight() < 0){
            return;
        }
        
        this.maximumCapacity-= item.weight();
        this.items.add(item);
    }
    
    @Override
    public String toString(){
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
        
    }
    
    
    
    @Override
    public double weight() {
        double weight = 0;
        for(Packable item : this.items){
            weight+=item.weight();
        }
        
        return weight;
    }
    
}
