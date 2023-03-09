package methods.exercises;

import java.util.Scanner;

public class VowelsCount
{
    private static void countVowels(String str)
    {
        String vowels = "AaEeIiOoUu";
        int numberOfVowels = 0;
        for(int i=0;i<str.length();i++)
        {
            String currentLetter = String.valueOf(str.charAt(i));
            if (vowels.contains(currentLetter))
            {
                ++numberOfVowels;
            }
        }
        System.out.println(numberOfVowels);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        countVowels(string);
    }
}
