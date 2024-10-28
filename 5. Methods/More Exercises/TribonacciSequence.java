package Methods.MoreExercises;

import java.util.Scanner;

public class TribonacciSequence
{
    private static void printTribonacciSequence(int endRange)
    {
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 2;

        for(int i=0;i<endRange;i++)
        {
            System.out.print(firstNumber + " ");
            int fourthNumber = firstNumber + secondNumber + thirdNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = fourthNumber;
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int endRange = Integer.parseInt(scanner.nextLine());

        printTribonacciSequence(endRange);
    }
}
