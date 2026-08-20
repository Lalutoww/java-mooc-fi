
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // Write your program here
        
        while(true){
            String input = scanner.nextLine();
            
            if(input.equals("end")){
                break;
            }
            
            int number = Integer.parseInt(input);
            list.add(number);
            
            
        }
        
        System.out.println(list.stream().mapToInt(x -> x).average().toString());
        
        

    }
}
