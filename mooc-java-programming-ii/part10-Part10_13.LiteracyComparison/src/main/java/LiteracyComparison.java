import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;


public class LiteracyComparison {
    
    public static void main(String[] args) {
        try{
            Files.lines(Paths.get("literacy.csv"))
                    .map(x -> x.split(","))
                    .sorted(Comparator.comparingDouble(x -> Double.parseDouble(x[5].trim())))
                    .forEach(x -> {
                        String country = x[3];
                        int year = Integer.parseInt(x[4]);
                        String gender = x[2].trim().split(" ")[0];
                        double literacy = Double.parseDouble(x[5]);
                        
                        System.out.println(country + " (" + year + ")" + ", " + gender + ", " + literacy);
                    });
                    
                    

        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
