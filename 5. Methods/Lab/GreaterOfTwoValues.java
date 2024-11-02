package Methods.Lab;

import java.util.Scanner;

public class GreaterOfTwoValues
{
    private static int getMax(int firstNumber, int secondNumber)
    {
        if(firstNumber > secondNumber)
        {
            return firstNumber;
        }
        return secondNumber;
    }
    private static char getMax(char firstChar, char secondChar)
    {
        if(firstChar > secondChar)
        {
            return firstChar;
        }
        return secondChar;
    }
    private static String getMax(String firstString, String secondString)
    {
        if(firstString.compareTo(secondString) > 0)
        {
            return firstString;
        }
        return secondString;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        if(type.equals("int"))
        {
            int firstNumber = Integer.parseInt(scanner.nextLine());
            int secondNumber = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(firstNumber,secondNumber));
        }
        else if(type.equals("char"))
        {
            char firstChar = scanner.nextLine().charAt(0);
            char secondChar = scanner.nextLine().charAt(0);
            System.out.println(getMax(firstChar,secondChar));
        }
        else if(type.equals("string"))
        {
            String firstString = scanner.nextLine();
            String secondString = scanner.nextLine();
            System.out.println(getMax(firstString,secondString));
        }
    }
}
