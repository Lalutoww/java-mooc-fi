
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        System.out.println("First: " + container1);
        System.out.println("Second: " + container2);

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            switch (command) {
                case "add": {
                    container1.add(amount);
                    System.out.println("First: " + container1);
                    System.out.println("Second: " + container2);
                    break;
                }
                case "move": {
                    if (container1.contains() == 0) {
                        continue;
                    }

                    if (amount > container1.contains() && container2.contains() + container1.contains() <= 100) {
                        container2.add(container1.contains());
                        container1.remove(100);
                    } else if (container2.contains() + amount <= 100) {
                        container2.add(amount);
                        container1.remove(amount);
                    } else if (amount > container1.contains() || amount < 0) {
                        continue;
                    } else {
                        container2.add(100);
                        container1.remove(100);
                    }
                    System.out.println("First: " + container1);
                    System.out.println("Second: " + container2);
                    break;
                }
                case "remove": {
                    container2.remove(amount);
                    System.out.println("First: " + container1);
                    System.out.println("Second: " + container2);
                    break;
                }
            }
        }
    }

}
