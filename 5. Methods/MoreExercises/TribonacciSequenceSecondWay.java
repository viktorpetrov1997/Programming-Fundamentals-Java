package Methods.MoreExercises;

import java.util.Scanner;

public class TribonacciSequenceSecondWay
{
    private static void printTribonacciSequence(int endRange)
    {
        int num1 = 1;
        int num2 = 1;
        int num3 = 2;

        int counter = 0;

        while (counter < endRange)
        {
            System.out.print(num1 + " ");

            int num4 = num1 + num2 + num3;
            num1 = num2;
            num2 = num3;
            num3 = num4;
            counter = counter + 1;
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int endRange = Integer.parseInt(scanner.nextLine());
        printTribonacciSequence(endRange);
    }
}
