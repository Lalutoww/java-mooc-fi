
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalutoww
 */
public class Employees {
    private List<Person> people;
    
    public Employees(){
        this.people = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.people.add(personToAdd);
    }
    
    public void add (List<Person> peopleToAdd){
        this.people.addAll(peopleToAdd);
    }
    
    public void print(){
        Iterator<Person> iterator = people.iterator();
        
        while(iterator.hasNext()){
                System.out.println(iterator.next());
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = people.iterator();
        
        while(iterator.hasNext()){
            Person p = iterator.next();
            if(p.getEducation().equals(education)){
                System.out.println(p);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = people.iterator();
            
        while(iterator.hasNext()){
            if(iterator.next().getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
