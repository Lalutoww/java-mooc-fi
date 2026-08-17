
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give numbers:");
        int sum = 0;
        int totalCount = 0;
        int evenCount = 0;
        int oddCount = 0;

        int number = 0;

        while (true) {
            number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            sum += number;

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            totalCount++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + totalCount);
        System.out.println("Average: " + (sum / (double) totalCount));
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);

    }
}
