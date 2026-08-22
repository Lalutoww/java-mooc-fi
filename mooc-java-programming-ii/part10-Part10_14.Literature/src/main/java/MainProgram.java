
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            
            if(bookName.isEmpty()){
                break;
            }
            
            System.out.print("Input the age recommendation: ");
            int ageRecommendation = Integer.parseInt(scanner.nextLine());
            
            books.add(new Book(bookName, ageRecommendation));            
        }
        
        System.out.println(books.size() + " books in total.");
        
        System.out.println("Books: ");
        books.stream().sorted().forEach(System.out::println);
    }

}
