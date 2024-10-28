package Methods.Exercises;

import java.util.Scanner;

public class TopNumber
{
    private static boolean isSumDigitsDivisible(int number)
    {
        int sumOfDigits = 0;

        while(number > 0)
        {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }

        return sumOfDigits % 8 == 0;
    }

    private static boolean holdsOddDigit(int number)
    {
        while(number > 0)
        {
            int digit = number % 10;
            if(digit % 2 != 0)
            {
                return  true;
            }
            number /= 10;
        }
        return  false;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for(int i=1;i<=number;i++)
        {
            if(isSumDigitsDivisible(i) && holdsOddDigit(i))
            {
                System.out.println(i);
            }
        }
    }
}
