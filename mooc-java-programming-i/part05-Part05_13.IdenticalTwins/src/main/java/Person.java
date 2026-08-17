
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }
        
        Person compared = (Person) obj;
        
        if(this.name == compared.name && this.birthday.equals(compared.birthday) && this.height == compared.height && this.weight == compared.weight){
            return true;
        }

        return false;
    }
}
