package TextProcessing.Exercises;

import java.util.Scanner;

public class CharacterMultiplier
{
    public static int getCharacterMultiplication(String firstSting, String secondString)
    {
        int length = Math.max(firstSting.length(),secondString.length());

        int product = 0;

        for (int i = 0; i < length; i++)
        {
            if(i < firstSting.length() && i < secondString.length())
            {
                product += firstSting.charAt(i) * secondString.charAt(i);
            }
            else if(i < firstSting.length())
            {
                product += firstSting.charAt(i);
            }
            else
            {
                product += secondString.charAt(i);
            }
        }
        return product;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] twoStrings = scanner.nextLine().split(" ");

        System.out.println(getCharacterMultiplication(twoStrings[0],twoStrings[1]));
    }
}
