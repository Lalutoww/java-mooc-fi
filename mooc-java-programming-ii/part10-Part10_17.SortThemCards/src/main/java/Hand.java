
import java.util.ArrayList;
import java.util.Collections;
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
public class Hand implements Comparable<Hand>{
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        this.hand.forEach(System.out::println);
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    private int getTotalValue(){
        return this.hand.stream().mapToInt(x -> x.getValue()).sum();
    }
    
    public void sortBySuit(){
        Collections.sort(this.hand, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand other) {
        return this.getTotalValue() - other.getTotalValue();
    }
    
}
