
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int a = scanner.nextInt();
        System.out.print("Where from? ");
        int b = scanner.nextInt();
        
        for(int i = b; i <= a; i++){
            System.out.println(i);
        }
    }
}
