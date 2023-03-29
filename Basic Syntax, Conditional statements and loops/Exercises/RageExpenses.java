package basic.syntax.exercises;

import java.util.Scanner;

public class RageExpenses
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int countLosesGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double monitorPrice = Double.parseDouble(scanner.nextLine());


        int countHeadset = countLosesGames / 2;
        int countMice = countLosesGames / 3;
        int countKeyBoards = countLosesGames / 6;
        int countMonitors = countLosesGames / 12;


        double expenses = (countHeadset * headsetPrice) + (countMice * mousePrice)
                + (countKeyBoards * keyboardPrice) + (countMonitors * monitorPrice);

        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
