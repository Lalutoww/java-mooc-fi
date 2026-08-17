
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;

        System.out.println("First: " + container1 + "/100");
        System.out.println("Second: " + container2 + "/100");

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
                    if (amount < 0) {
                        continue;
                    } else if (container1 + amount <= 100) {
                        container1 += amount;
                    } else {
                        container1 = 100;
                    }
                    System.out.println("First: " + container1 + "/100");
                    System.out.println("Second: " + container2 + "/100");
                    break;
                }
                case "move": {
                    if (container1 == 0) {
                        continue;
                    }

                    if (amount > container1 && container2 + container1 <= 100) {
                        container2 += container1;
                        container1 = 0;
                    } else if (container2 + amount <= 100) {
                        container2 += amount;
                        container1 -= amount;
                    } else if (amount > container1 || amount < 0) {
                        continue;
                    } else {
                        container2 = 100;
                        container1 = 0;
                    }
                    System.out.println("First: " + container1 + "/100");
                    System.out.println("Second: " + container2 + "/100");
                    break;
                }
                case "remove": {
                    if (amount < 0) {
                        continue;
                    } else if (container2 - amount >= 0) {
                        container2 -= amount;
                    } else {
                        container2 = 0;
                    }
                    System.out.println("First: " + container1 + "/100");
                    System.out.println("Second: " + container2 + "/100");
                    break;
                }
            }

        }
    }

}
