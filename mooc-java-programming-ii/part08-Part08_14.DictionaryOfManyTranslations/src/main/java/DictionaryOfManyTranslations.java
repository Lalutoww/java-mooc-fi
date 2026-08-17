
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalutoww
 */
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> wordTranslations;

    public DictionaryOfManyTranslations() {
        this.wordTranslations = new HashMap<>();
    }
    
    public void add(String word, String translation){
        if(!this.wordTranslations.containsKey(word)){
            ArrayList<String> translations = new ArrayList<>();
            translations.add(translation);
            this.wordTranslations.put(word, translations);
        }else{
            this.wordTranslations.get(word).add(translation);
        }
    }
    
    public ArrayList<String> translate(String word){
        return this.wordTranslations.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word){
        this.wordTranslations.remove(word);
    }
    
}
