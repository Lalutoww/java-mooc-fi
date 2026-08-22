/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalutoww
 */
public class Book implements Comparable<Book>{
    private String name;
    private int ageRecommendation;

    public Book(String name, int ageRecommendation) {
        this.name = name;
        this.ageRecommendation = ageRecommendation;
    }
    
    @Override
    public String toString(){
        return String.format("%s (recommended for %d year-olds or older)", this.name, this.ageRecommendation);
    }

    @Override
    public int compareTo(Book other) {
        if(this.ageRecommendation - other.ageRecommendation == 0){
            return this.name.compareTo(other.name);
        }
            
            return this.ageRecommendation - other.ageRecommendation;
    }
}
