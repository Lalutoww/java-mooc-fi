
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int age = 0;
        while (!input.equals("")) {
            int currentAge = Integer.valueOf(input.split(",")[1]);
            if (currentAge > age) {
                age = currentAge;
            }

            input = scanner.nextLine();
        }
        System.out.println("Age of the oldest: " + age);

    }
}
