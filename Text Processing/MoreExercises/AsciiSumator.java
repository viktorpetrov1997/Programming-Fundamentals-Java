package TextProcessing.MoreExercises;

import java.util.Scanner;

public class AsciiSumator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();

        int start = (int) Math.min(firstChar,secondChar);
        int end = (int) Math.max(firstChar,secondChar);

        int sum = 0;

        for (int i = 0; i < text.length(); i++)
        {
            int currentChar = (int)(text.charAt(i));
            if(currentChar > start && currentChar < end)
            {
                sum += currentChar;
            }
        }

        System.out.println(sum);
    }
}
