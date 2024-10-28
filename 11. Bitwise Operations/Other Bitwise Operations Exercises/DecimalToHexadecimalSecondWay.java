package BitwiseOperations.Lecture;

import java.util.Scanner;

public class DecimalToHexadecimalSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());

        StringBuilder hex = new StringBuilder();

        while (decimal > 0)
        {
            int remainder = decimal % 16;
            char hexDigit = (char) (remainder < 10 ? '0' + remainder : 'A' + remainder - 10);
            hex.insert(0, hexDigit);
            decimal /= 16;
        }

        System.out.println(hex.toString());
    }
}
