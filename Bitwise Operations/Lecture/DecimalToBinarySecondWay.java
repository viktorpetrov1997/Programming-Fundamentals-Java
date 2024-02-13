package BitwiseOperations.Lecture;

import java.util.Scanner;

public class DecimalToBinarySecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        long binary = 0;
        int power = 1;

        while(number > 0)
        {
            int remainder = number % 2;
            binary += remainder * power;
            power *= 10;
            number /= 2;
        }

        System.out.println(binary);

    }
}
