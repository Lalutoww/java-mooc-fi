
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();

            if (num != 0) {
                count++;
                sum+=num;
            } else {
                break;
            }
        }
        
        System.out.println("Average of the numbers: " + sum / (double) count);
    }
}
