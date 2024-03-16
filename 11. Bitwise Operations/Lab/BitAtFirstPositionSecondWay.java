package BitwiseOperations.Lab;

import java.util.Scanner;

public class BitAtFirstPositionSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n, bitAtPosition1;

        n = scanner.nextInt();

        bitAtPosition1 = (n >> 1) & 1;

        System.out.println(bitAtPosition1);
    }
}
