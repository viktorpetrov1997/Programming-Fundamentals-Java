package BitwiseOperations.Lecture;

import java.util.Scanner;

public class HexadecimalToDecimal
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String hex = scanner.nextLine();
        hex = hex.replace("0x","");
        hex = hex.toUpperCase();

        String digits = "0123456789ABCDEF";
        int decimalValue = 0;

        for (int i = 0; i < hex.length(); i++)
        {
            char hexChar = hex.charAt(i);
            int digit = digits.indexOf(hexChar);
            decimalValue = 16 * decimalValue + digit;
        }

        System.out.println(decimalValue);
    }
}
