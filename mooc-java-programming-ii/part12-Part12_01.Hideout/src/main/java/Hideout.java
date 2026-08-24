/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalutoww
 */
public class Hideout<T> {
    private T item;

    public Hideout() {
    }
    
    public void putIntoHideout(T toHide){
        this.item = toHide;
    }
    
    public T takeFromHideout(){
        T currentItem = this.item;
        this.item = null;
        return currentItem;
    }
    
    public boolean isInHideout(){
        return this.item != null;
    }
}
