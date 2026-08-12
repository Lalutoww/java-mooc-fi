
import java.nio.file.Paths;
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

    private Scanner scanner;
    private CookBook cookbook;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.cookbook = new CookBook();
    }

    private void fillCookBook() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        cookbook.fillBook(fileName);
    }

    private void readCommands() {
        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            switch (command) {
                case "list": {
                    System.out.println("Recipes:");
                    for (Recipe r : cookbook.getRecipes()) {
                        System.out.println(r);
                    }
                    break;
                }
                case "find name": {
                    System.out.print("Searched word: ");
                    String searchedWord = scanner.nextLine();

                    cookbook.printByName(searchedWord);
                    break;
                }
                case "find cooking time": {
                    System.out.print("Max cooking time: ");
                    int maxCookingTime = Integer.parseInt(scanner.nextLine());

                    cookbook.printByCookingTime(maxCookingTime);
                    break;
                }
                case "find ingredient": {
                    System.out.print("Ingredient: ");
                    String ingredient = scanner.nextLine();

                    cookbook.printByIngredient(ingredient);
                    break;
                }
                default:{
                    break;
                }

            }
        }
    }

    public void start() {
        this.fillCookBook();
        this.readCommands();
    }
}
