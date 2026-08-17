
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
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    private int calculateTotalWeight(){
        int totalWeight = 0;
        
        for(Suitcase s : suitcases){
            totalWeight+=s.totalWeight();
        }
        
        return totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.calculateTotalWeight() + suitcase.totalWeight() > this.maximumWeight){
            return;
        }
        
        this.suitcases.add(suitcase);
    }
    
    public void printItems(){
        for(Suitcase s : suitcases){
            s.printItems();
        }
    }
    
    @Override
    public String toString(){
        if(this.suitcases.isEmpty()){
            return "no suitcases (0 kg)";
        }
        return this.suitcases.size() > 1 ? String.format("%d suitcases (%d kg)",this.suitcases.size(), this.calculateTotalWeight()) : String.format("1 suitcase (%d kg)", this.calculateTotalWeight());
    }
}
