
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString(){
        if(this.elements.isEmpty()){
            return String.format("The collection %s is empty.", this.name);
        }
        
        String output = this.elements.size() > 1 ? String.format("The collection %s has %d elements:%n",this.name, this.elements.size()) : String.format("The collection %s has 1 element:%n",this.name);
        
        for(String element : this.elements){
            output+=element + "\n";
        }
        
        return output.trim();
    }
}
