
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // toteuta ohjelmasi tänne
        
         while(true){
            String input = scanner.nextLine();
            
            if(input.equals("end")){
                break;
            }
            
            int number = Integer.parseInt(input);
            list.add(number);
            
            
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        
        if(choice.equals("n")){
            System.out.println(list.stream().mapToInt(x -> x).filter(x -> x < 0).average().toString());
        }else{
         System.out.println(list.stream().mapToInt(x -> x).filter(x -> x > 0).average().toString());   
        }
         

    }
}
