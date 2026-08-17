
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int a = scanner.nextInt();
        int sum = 1;
        for (int i = 2; i <= a; i++) {
            sum+=i;
        }
        
        System.out.println("The sum is " + sum);
    }
}
