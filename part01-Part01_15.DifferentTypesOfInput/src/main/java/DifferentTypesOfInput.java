
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String text = scan.nextLine();
        System.out.println("Give an integer:");
        int numOne = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double numTwo = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + numOne);
        System.out.println("You gave the double " + numTwo);
        System.out.println("You gave the boolean " + bool);
    }
}
