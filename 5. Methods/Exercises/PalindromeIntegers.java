package Methods.Exercises;

import java.util.Scanner;

public class PalindromeIntegers
{
    private static void isPalindrome(String number)
    {
        String numberInReverseOrder = "";

        for(int i=number.length() - 1;i>=0;i--)
        {
            numberInReverseOrder += number.charAt(i);
        }

        if(number.equals(numberInReverseOrder))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while(!input.equals("END"))
        {
            isPalindrome(input);

            input = scanner.nextLine();
        }
    }
}
