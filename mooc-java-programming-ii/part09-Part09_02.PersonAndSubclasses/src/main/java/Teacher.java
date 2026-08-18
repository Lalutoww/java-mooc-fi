/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalutoww
 */
public class Teacher extends Person{
    private int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return String.format("%s%n  %s%n  salary %d euro/month", this.getName(), this.getAddress(), this.salary);
    }
    
    
}
