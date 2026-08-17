
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics stats = new Statistics();

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }

            stats.addPoints(input);
        }

        System.out.println("Point average (all): " + stats.getAverage());

        double passingAverage = stats.getPassingAverage();
        if (passingAverage != -1) {
            double passPercentage = 100.0 * stats.getPassingCount() / stats.getParticipantsCount();

            System.out.println("Point average (passing): " + passingAverage);
            System.out.println("Pass percentage: " + passPercentage);

        } else {
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: 0.0");
        }

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + "*".repeat(stats.getPointsDistribution(i)));
        }

    }
}
