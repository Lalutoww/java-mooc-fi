
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        
        int age = 0;
        String oldestName = "";
        
        while (!input.equals("")) {
            String name = input.split(",")[0];
            
            int currentAge = Integer.valueOf(input.split(",")[1]);
            
            if (currentAge > age) {
                age = currentAge;
                oldestName = name;
                
            }

            input = scanner.nextLine();
        }
        System.out.println("Name of the oldest: " + oldestName);

    }
}
