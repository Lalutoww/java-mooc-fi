
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalutoww
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> units;

    public StorageFacility() {
        this.units = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (!this.units.containsKey(unit)) {
            ArrayList<String> translations = new ArrayList<>();
            translations.add(item);
            this.units.put(unit, translations);
        } else {
            this.units.get(unit).add(item);
        }
    }

    public ArrayList<String> contents(String storageUnit){
        return this.units.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
        this.units.get(storageUnit).remove(item);
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> storageUnits = new ArrayList<>();
        
        for(Map.Entry<String, ArrayList<String>> storageUnit : this.units.entrySet()){
            if(!storageUnit.getValue().isEmpty()){
                storageUnits.add(storageUnit.getKey());
            }
        }
        return storageUnits;
    }
}
