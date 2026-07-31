
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalutoww
 */
public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (this.hasJokes()) {
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        int index = draw.nextInt(jokes.size());
        return jokes.get(index);
    }

    public boolean hasJokes() {
        return this.jokes.isEmpty();
    }

    public void printJokes() {
        System.out.println("Printing the jokes.");
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }

}
