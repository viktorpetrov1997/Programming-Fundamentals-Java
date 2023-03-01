package basic.syntax.exercises;

import java.util.Scanner;

public class StrongNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;
        int sumFactDigit = 0;

        while(number != 0) {
            int lastDigit = number % 10;
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++)
            {
                fact = fact * i;
            }
            sumFactDigit += fact;
            number = number / 10;
        }

        if (startNumber == sumFactDigit)
        {
            System.out.println("yes");
        } else
        {
            System.out.println("no");
        }
    }
}
