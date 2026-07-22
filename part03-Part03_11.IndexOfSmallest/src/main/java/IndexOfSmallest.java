
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        // implement here a program that reads user input
        while (true) {
            int number = scanner.nextInt();
            
            // until the user enters 9999   
            if (number == 9999) {
                break;
            }

            list.add(number);

        }

        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);

            if (current < smallest) {
                smallest = current;
            }

        }
        
        // after that, the program prints the smallest number
        System.out.println("Smallest number: " + smallest);

        // and its index -- the smallest number
        // might appear multiple times
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);

            if (smallest == current) {
                System.out.println("Found at index: " + i);
            }

        }
    }
}
