package BitwiseOperations.Lecture;

import java.util.Scanner;

public class BinaryToDecimalSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        long number = Long.parseLong(scanner.nextLine());

        int decimalNumber = 0;
        int power = 0;

        long remainder;

        while(number != 0)
        {
            remainder = number % 10;
            number /= 10;
            decimalNumber += remainder * Math.pow(2, power);
            ++power;
        }

        System.out.println(decimalNumber);
    }
}
