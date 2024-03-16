package BitwiseOperations.Lecture;

import java.util.Scanner;

public class HexadecimalToDecimalSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String hex = scanner.nextLine();
        hex = hex.replace("0x","");

        int decimal = Integer.parseInt(hex, 16);

        System.out.println(decimal);
    }
}
