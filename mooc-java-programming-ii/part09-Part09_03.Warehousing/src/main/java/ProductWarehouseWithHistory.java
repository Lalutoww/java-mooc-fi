/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalutoww
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.history.add(this.getBalance());
        
    }
    
    
    public double takeFromWarehouse(double amount){
        double value = super.takeFromWarehouse(amount);
        this.history.add(this.getBalance());
        return value;
    }
    
    public void printAnalysis(){
        System.out.printf("Product: %s\n" +
"History: %s\n" +
"Largest amount of product: %.1f\n" +
"Smallest amount of product: %.1f\n" +
"Average: %.1f", this.getName(), this.history(), this.history.maxValue(), this.history.minValue(), this.history.average());
    }

    public String history() {
        return this.history.toString();
    }

}
