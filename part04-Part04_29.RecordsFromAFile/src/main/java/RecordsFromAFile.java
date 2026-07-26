
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try ( Scanner sc = new Scanner(Paths.get(fileName))) {
                
            while(sc.hasNextLine()){
                String input = sc.nextLine();
                if(input.isEmpty()){
                    continue;
                }

               String[] data = input.split(",");
               String name = data[0];
               int age = Integer.valueOf(data[1]);
               
               String output = age != 1 ? String.format("%s, age: %d years", name, age) : String.format("%s, age: %d year", name, age);
                System.out.println(output);
                
            }
                    
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
