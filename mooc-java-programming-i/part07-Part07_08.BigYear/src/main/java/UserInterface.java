
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalutoww
 */
public class UserInterface {
    private Scanner scan;
    private BirdDatabase birds;

    public UserInterface() {
        this.scan = new Scanner(System.in);
        this.birds = new BirdDatabase();
    }
    
    
    
    public void start(){
        while(true){
            System.out.print("? ");
            String command = scan.nextLine();
            
            if(command.equals("Quit")){
                break;
            }
            
            switch(command){
                case "Add":{
                    this.addBird();
                    break;
                }
                case "Observation":{
                    this.observeBird();
                    break;
                }
                case "All":{
                    birds.printAllBirds();
                    break;
                }
                case "One":{
                    this.printOneBird();
                    break;
                }
                default: {
                    System.out.println("Unknown command!");
                    break;
                }
            }
        }    
    }
    
    private void addBird(){
        System.out.print("Name: ");
        String name = scan.nextLine();
                    
        System.out.print("Name in Latin: ");
        String latinName = scan.nextLine();
                    
        birds.addBird(name, latinName);
    }
    
    private void observeBird(){
        System.out.print("Bird? ");
        String birdName = scan.nextLine();
                    
        Bird bird = birds.findBird(birdName);
                    
        if(bird != null){
            bird.addObservation();
        }
    }
    
    private void printOneBird(){
        System.out.print("Bird? ");
        String birdName = scan.nextLine();
                    
        Bird bird = birds.findBird(birdName);
                    
        if(bird != null){
            System.out.println(bird);
        }
    }
}
