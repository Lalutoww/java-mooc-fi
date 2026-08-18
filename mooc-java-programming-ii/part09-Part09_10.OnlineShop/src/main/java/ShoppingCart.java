
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalutoww
 */
public class ShoppingCart {
    private Map<String,Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }
    
    public void add(String product, int price){
        if(this.shoppingCart.containsKey(product)){
            Item item = this.shoppingCart.get(product);
            item.increaseQuantity();
            
            this.shoppingCart.put(product, item);
            return;
        }
        
        this.shoppingCart.put(product, new Item(product, 1, price));
    }
    
    public int price(){
        int totalPrice = 0;
        
        for(Item i : this.shoppingCart.values()){
            totalPrice+= i.price();
        }
        return totalPrice;
    }
    
    public void print(){
        for(Entry<String,Item> i : this.shoppingCart.entrySet()){
            System.out.println(i.getKey() + ": " + i.getValue().getQty());
        }
    }
    
}
