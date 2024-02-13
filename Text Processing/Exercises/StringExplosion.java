package TextProcessing.Exercises;

import java.util.Scanner;

public class StringExplosion
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        int strength = 0;

        for (int i = 0; i < text.length(); i++)
        {
            char currentChar = text.charAt(i);
            if(currentChar == '>')
            {
                strength += Integer.parseInt(String.valueOf(text.charAt(i + 1)));
            }
            else if(currentChar != '>' && strength > 0)
            {
                text.deleteCharAt(i);
                --strength;
                --i;
            }
        }
        System.out.println(text);
    }
}
