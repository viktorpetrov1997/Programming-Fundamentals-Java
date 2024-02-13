package BitwiseOperations.Lecture;

import java.util.Scanner;

public class DecimalToBinary
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        StringBuilder binary = new StringBuilder();

        while(number > 0)
        {
            int remainder = number % 2;
            binary.append(remainder);
            number /= 2;
        }

        System.out.println(binary.reverse());
    }
}
