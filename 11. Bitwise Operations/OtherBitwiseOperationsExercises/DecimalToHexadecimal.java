package BitwiseOperations.Lecture;

import java.util.Scanner;

public class DecimalToHexadecimal
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());

        String hex = Integer.toHexString(decimal).toUpperCase();

        System.out.println(hex);
    }
}
