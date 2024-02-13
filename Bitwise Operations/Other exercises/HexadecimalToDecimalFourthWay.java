package BitwiseOperations.Lecture;

import java.util.Scanner;

public class HexadecimalToDecimalFourthWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String hex = scanner.nextLine();
        hex = hex.replace("0x","");

        int power = hex.length() - 1;

        int decimal = 0;

        for (int i = 0; i < hex.length(); i++)
        {
            char hexadecimal = hex.charAt(i);
            int digit = Character.digit(hexadecimal, 16);
            decimal += digit * Math.pow(16,power);
            --power;
        }
        System.out.println(decimal);
    }
}
