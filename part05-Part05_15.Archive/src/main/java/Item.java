/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalutoww
 */
public class Item {
    private String identifier;
    private String name;
    
    public Item(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        
        if(!(obj instanceof Item)){
            return false;
        }
        
        Item compared = (Item) obj;
        
        if(this.identifier.equals(compared.identifier)){
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s", this.identifier, this.name);
    }
}
