
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
public class Stack {
    private ArrayList<String> contents;
    
    public Stack(){
        this.contents = new ArrayList<String>();
    }
    
    public boolean isEmpty(){
        return this.contents.size() == 0;
    }
    
    public void add(String value){
        if(this.isEmpty()){
            this.contents.add(value);
            return;
        }
        
        this.contents.add(this.contents.size(), value);
        
    }
    
    public ArrayList<String> values(){
        return this.contents;
    }
    
    public String take(){
        String element = this.contents.remove(this.contents.size() - 1);
        return element;
    }
}
