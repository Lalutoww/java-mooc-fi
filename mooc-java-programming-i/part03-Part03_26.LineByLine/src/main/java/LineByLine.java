
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        while(!input.equals("")){
             String[] words = input.split(" ");
             for(String word : words){
                 System.out.println(word);
             }
            
            
            input = scanner.nextLine();
        }

    }
}
