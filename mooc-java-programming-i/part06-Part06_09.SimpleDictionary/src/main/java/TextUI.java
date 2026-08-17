
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
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            String command = recieveCommand();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                addHelper();
            } else if (command.equals("search")) {
                searchHelper();
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
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");

        String translation = scanner.nextLine();
        dictionary.add(word, translation);
    }

    private void searchHelper() {
        System.out.print("To be translated: ");
        String word = scanner.nextLine();        

        String transatedWord = dictionary.translate(word);
        
        if(transatedWord == null){
            System.out.println("Word " + word + " was not found");
            return;
        }

        System.out.println("Translation: " + transatedWord);
    }
}
