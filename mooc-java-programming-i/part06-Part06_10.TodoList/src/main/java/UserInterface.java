
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
        while (true) {
            String command = recieveCommand();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                addHelper();
            } else if (command.equals("list")) {
                this.list.print();
            } else if(command.equals("remove")){
                removeHelper();
            } else {
                System.out.println("Unknown command");
            }
        }

    }

    private String recieveCommand() {
        System.out.print("Command: ");
        return scanner.nextLine();
    }

    private void addHelper() {
        System.out.print("To add: ");
        String word = scanner.nextLine();

        this.list.add(word);
    }

    private void removeHelper() {
        System.out.print("Which one is removed: ");
        int taskToRemove = Integer.valueOf(scanner.nextLine());
           
        this.list.remove(taskToRemove);
    }
}
