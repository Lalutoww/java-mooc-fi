
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            int num = scanner.nextInt();

            if (num > 0) {
                count++;
                sum += num;
            } else if (num < 0) {
                continue;
            } else {
                break;
            }
        }

        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum / (double) count);
        }

    }
}
