
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try ( Scanner sc = new Scanner(Paths.get(file))) {
                
            while(sc.hasNextLine()){
                String input = sc.nextLine();
                if(input.isEmpty()){
                    continue;
                }

               String[] data = input.split(",");
               String name = data[0];
               int age = Integer.valueOf(data[1]);
               
               persons.add(new Person(name, age));
            }
                    
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return persons;

    }
}
