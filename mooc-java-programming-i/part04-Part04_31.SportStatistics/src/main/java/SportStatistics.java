
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Team:");
        String teamName = scan.nextLine();

        int gamesCount = 0;
        int winsCount = 0;
        int lossesCount = 0;

        try ( Scanner sc = new Scanner(Paths.get(fileName))) {

            while (sc.hasNextLine()) {
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    continue;
                }

                String[] gameData = input.split(",");
                String teamOne = gameData[0];
                String teamTwo = gameData[1];
                int homePoints = Integer.valueOf(gameData[2]);
                int visitorPoints = Integer.valueOf(gameData[3]);

                if (teamOne.equals(teamName) || teamTwo.equals(teamName)) {
                    gamesCount++;
                    if (teamOne.equals(teamName) && homePoints > visitorPoints) {
                        winsCount++;
                    } else if (teamTwo.equals(teamName) && visitorPoints > homePoints) {
                        winsCount++;
                    } else {
                        lossesCount++;
                    }
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        System.out.println("Games: " + gamesCount);
        System.out.println("Wins: " + winsCount);
        System.out.println("Losses: " + lossesCount);
    }

}
