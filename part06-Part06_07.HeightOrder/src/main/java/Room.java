
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
public class Room {
    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person){
        this.people.add(person);
    }
    
    public boolean isEmpty(){
        return this.people.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.people;
    }
    
    public Person shortest(){
        if(this.isEmpty()){
            return null;
        }
        Person shortest = this.people.get(0);
        
        for(int i = 1; i < this.people.size(); i++){
            if(this.people.get(i).getHeight() < shortest.getHeight()){
                shortest = this.people.get(i);
            }
        }
        return shortest;
    }
    
    public Person take(){
        
        if(this.isEmpty()){
            return null;
        }
        
        Person p  = this.shortest();
        return this.people.remove(this.people.indexOf(p));
    }
    
    
}
