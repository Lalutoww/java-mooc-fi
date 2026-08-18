
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalutoww
 */
public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }
    
    
    
    public void addProduct(String product, int price, int stock){
        if(this.stocks.containsKey(product)){
            this.stocks.put(product, this.stocks.get(product) + stock);
            return;
        }
        
        this.stocks.put(product, stock);
        this.prices.put(product, price);
    }
    
    public int price(String product){
        if(!this.prices.containsKey(product)){
            return -99;
        }
        
        return this.prices.get(product);
    }
    
    public int stock(String product){
        if(!this.stocks.containsKey(product)){
            return 0;
        }
        
        return this.stocks.get(product);
    }
    
    public boolean take(String product){
        if(!this.stocks.containsKey(product)){
            return false;
        }
        
        if(this.stocks.get(product) - 1 >= 0){
            this.stocks.put(product, this.stocks.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        return this.stocks.keySet();
    }
}
