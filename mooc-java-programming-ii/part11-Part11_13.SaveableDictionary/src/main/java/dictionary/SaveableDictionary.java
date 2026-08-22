/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author lalutoww
 */
public class SaveableDictionary {
    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }
    
    public void add(String words, String translation){
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary.putIfAbsent(translation, words);
    }
    
    public String translate(String word){
        return this.dictionary.getOrDefault(word, null);
    }
    
    public void delete(String word) {
        String translation = this.dictionary.get(word);
        if (translation != null) {
            this.dictionary.remove(word);
            this.dictionary.remove(translation);
        }
    }
    
    public boolean load() {
        try (Scanner fileReader = new Scanner(new File(this.file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(new File(this.file))) {
            List<String> alreadySaved = new ArrayList<>();

            for (Map.Entry<String, String> entry : this.dictionary.entrySet()) {
                String word = entry.getKey();
                String translation = entry.getValue();

                if (!alreadySaved.contains(word)) {
                    writer.println(word + ":" + translation);
                    alreadySaved.add(word);
                    alreadySaved.add(translation);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
