package BitwiseOperations.Lecture;

import java.util.Scanner;

public class BinaryToDecimal
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String binaryNumber = scanner.nextLine();
        int power = binaryNumber.length() - 1;
        int decimal = 0;

        for(int i = 0; i < binaryNumber.length(); i++)
        {
            //int digit = Integer.parseInt(String.valueOf(binaryNumber.charAt(i)));
            int digit = Character.getNumericValue(binaryNumber.charAt(i));
            decimal += digit * Math.pow(2,power);
            --power;
        }

        System.out.println(decimal);
    }
}
