package arrays.exercises;

import java.util.Scanner;

public class TrainSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int numberOfPeople = 0;

        for(int i=0;i<n;i++)
        {
            numberOfPeople = Integer.parseInt(scanner.nextLine());
            System.out.printf(numberOfPeople + " ");
            sum += numberOfPeople;
        }

        System.out.println();
        System.out.println(sum);
    }
}
