
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers should be printed");
        
        int count = Integer.parseInt(scanner.nextLine());
        
        for(int i = 0; i < count; i++){
            Random rand = new Random();
            int number = rand.nextInt(11);
            System.out.println(number);
        }
    }

}
