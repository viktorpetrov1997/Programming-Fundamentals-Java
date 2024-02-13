package DataTypesAndVariables;

import java.util.Scanner;

public class ReversedChars
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.next().charAt(0);
        char secondChar = scanner.next().charAt(0);
        char thirdChar = scanner.next().charAt(0);
        System.out.println("" + thirdChar + " " + secondChar + " " + firstChar);
    }
}
