package Methods.Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds
{
    private static int getSumOfEvenDigits(int number)
    {
        int sumOfEvenDigits = 0;
        while(number > 0)
        {
            int digit = number % 10;
            if(digit % 2 == 0) sumOfEvenDigits += digit;
            number /= 10;
        }
        return sumOfEvenDigits;
    }

    private static int getSumOfOddDigits(int number)
    {
        int sumOfOddDigits = 0;
        while(number > 0)
        {
            int digit = number % 10;
            if(digit % 2 != 0) sumOfOddDigits += digit;
            number /= 10;
        }
        return sumOfOddDigits;
    }

    private static int getMultipleOfEvenAndOdds(int number)
    {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);

        return evenSum * oddSum;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(getMultipleOfEvenAndOdds(number));
    }
}
