
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        int longestNameLength = 0;
        String longestName = "";
        int ageSum = 0;
        int count = 0;
        
        while (!input.equals("")) {
            String name = input.split(",")[0];
            int currentAge = Integer.valueOf(input.split(",")[1]);
            
            if(name.length() > longestNameLength){
                longestName = name;
                longestNameLength = name.length();
            }
            
            ageSum+=currentAge;
            count++;

            input = scanner.nextLine();
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ageSum / (double) count);


    }
}
