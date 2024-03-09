package Methods.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOddsSecondWay
{
    private static int getSumOfEvenDigits(int number)
    {
        String intToString = Integer.toString(number);

        int[] digits = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int sumOfEvenDigits = 0;

        for(int i=0;i<digits.length;i++)
        {
            if(digits[i] % 2 == 0)
            {
                sumOfEvenDigits += digits[i];
            }
        }
        return sumOfEvenDigits;
    }

    private static int getSumOfOddDigits(int number)
    {
        String intToString = Integer.toString(number);

        int[] digits = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int sumOfOddDigits = 0;

        for(int i=0;i<digits.length;i++)
        {
            if(digits[i] % 2 != 0)
            {
                sumOfOddDigits += digits[i];
            }
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
