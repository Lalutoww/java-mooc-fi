
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // implement here a program, that first reads user input
        while (true) {
            int number = scanner.nextInt();

            // adding them on a list until user gives -1.
            if (number == -1) {
                break;
            }

            list.add(number);
        }

        int sum = 0;
        for (int current : list) {
            sum += current;
        }

        System.out.println("Average: " + (double) sum / list.size());
        // Then it computes the average of the numbers on the list
        // and prints it.

    }
}
