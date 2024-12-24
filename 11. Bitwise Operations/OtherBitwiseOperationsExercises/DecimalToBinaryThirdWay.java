package BitwiseOperations.Lecture;

import java.util.Scanner;

public class DecimalToBinaryThirdWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String binary = Integer.toBinaryString(number);

        System.out.println(binary);
    }
}
