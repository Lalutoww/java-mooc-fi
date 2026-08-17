
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public int totalWeight(){
        if(this.items.isEmpty()){
            return 0;
        }
        
        int totalWeight = 0;
        for(Item item : items){
            totalWeight+=item.getWeight();
        }
        return totalWeight;
    }
    
    public void addItem(Item item){
        if(totalWeight() + item.getWeight() > this.maximumWeight){
            return;
        }
            this.items.add(item);
    }
    
    public void printItems(){
        for(Item item : items){
            System.out.println(item);
        }
    }
        
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for(int i = 1; i < this.items.size(); i++){
            if(this.items.get(i).getWeight() > heaviest.getWeight()){
                heaviest = this.items.get(i);
            }
        }
        return heaviest;
    }
    
    @Override
    public String toString(){
        if(this.items.isEmpty()){
            return "no items (0 kg)";
        }
        return this.items.size() > 1 ? String.format("%d items (%d kg)",this.items.size(), this.totalWeight()) : String.format("1 item (%d kg)", this.totalWeight());
    }
}
