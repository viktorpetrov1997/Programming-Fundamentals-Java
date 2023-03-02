package basic.syntax.more.exercises;

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String reversedString = "";

        for(int i = word.length() - 1;i >= 0; i--)
        {
            reversedString += word.charAt(i);
        }

        System.out.println(reversedString);
    }
}
