
import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        this.numberOfFaces = numberOfFaces;
    }

    public int throwDie() {
        // generate a random number which may be any number
        Random rand = new Random();
        // between one and the number of faces, and then return it
        int number = rand.nextInt(numberOfFaces) + 1;
        return number;
    }
}
