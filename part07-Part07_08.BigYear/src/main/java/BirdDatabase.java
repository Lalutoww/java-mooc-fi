
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
public class BirdDatabase {

    private ArrayList<Bird> birdList;

    public BirdDatabase() {
        this.birdList = new ArrayList<>();
    }

    public ArrayList<Bird> getBirdList() {
        return birdList;
    }

    public void addBird(String name, String latinName) {
        this.birdList.add(new Bird(name, latinName));
    }

    public Bird findBird(String birdName) {
        Bird searchedBird = birdList.stream().filter(x -> x.getName().equals(birdName)).findFirst().orElse(null);

        if (searchedBird == null) {
            System.out.println("Not a bird!");
        }
        return searchedBird;
    }

    public void printAllBirds() {        
        for (Bird b : birdList) {
            System.out.println(b);
        }
    }

}
