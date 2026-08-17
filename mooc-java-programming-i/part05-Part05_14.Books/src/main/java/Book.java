
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        
        if(!(obj instanceof Book)){
            return false;
        }
        
        Book compared = (Book) obj;
        
        if(this.name.equals(compared.name) && this.publicationYear == compared.publicationYear){
            return true;
        }
        
        return false;
    }

}
