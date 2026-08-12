
import java.nio.file.Paths;
import java.util.ArrayList;
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
public class CookBook {

    private ArrayList<Recipe> recipes;

    public CookBook() {
        this.recipes = new ArrayList<>();
    }

    public void fillBook(String fileName) {
        try ( Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                int cookingTime = Integer.parseInt(fileScanner.nextLine());
                Recipe recipe = new Recipe(name, cookingTime);

                while (fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();

                    if (ingredient.isEmpty()) {
                        break;
                    }

                    recipe.addIngredient(ingredient);
                }
                recipes.add(recipe);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public void printByName(String searchedWord) {
        System.out.println("Recipes:");
        for (Recipe r : getRecipes()) {
            if (r.getName().contains(searchedWord)) {
                System.out.println(r);
            }
        }
    }

    public void printByCookingTime(int maxCookingTime) {
        System.out.println("Recipes:");
        for (Recipe r : getRecipes()) {
            if (r.getCookingTime() <= maxCookingTime) {
                System.out.println(r);
            }
        }
    }

    public void printByIngredient(String ingredient) {
        System.out.println("Recipes:");
        for (Recipe r : getRecipes()) {
            if (r.getIngredients().contains(ingredient)) {
                System.out.println(r);
            }
        }
    }

}
