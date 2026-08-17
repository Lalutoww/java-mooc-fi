
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
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {      
        this.list = list;
        this.scanner = scanner;
        
    }

    public void start() {
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")){
                break;
            }
            
            switch(command){
                case "add":{
                    add();
                    break;
                }
                case "list":{
                    list.print();
                    break;
                }
                case "remove":{
                    remove();
                    break;
                }
            }
        }
    }
    
    private void add(){
        System.out.print("To add: ");
        list.add(scanner.nextLine());
    }
    
    private void remove(){
        System.out.print("Which one is removed? ");
        int number = Integer.valueOf(scanner.nextLine());
        list.remove(number);
    }
    
}
