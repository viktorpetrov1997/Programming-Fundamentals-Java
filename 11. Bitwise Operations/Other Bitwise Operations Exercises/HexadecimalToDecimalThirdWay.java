package BitwiseOperations.Lecture;

import java.util.Scanner;

public class HexadecimalToDecimalThirdWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String hex = scanner.nextLine();
        hex = hex.replace("0x","");

        int decimal = 0;

        for (int i = 0; i < hex.length(); i++)
        {
            char c = hex.charAt(i);
            int digit = 0;
            if (c >= '0' && c <= '9')
            {
                digit = c - '0';
            }
            else if (c >= 'A' && c <= 'F')
            {
                digit = c - 'A' + 10;
            }
            else if (c >= 'a' && c <= 'f')
            {
                digit = c - 'a' + 10;
            }
            decimal = decimal * 16 + digit;
        }

        System.out.println(decimal);
    }
}
