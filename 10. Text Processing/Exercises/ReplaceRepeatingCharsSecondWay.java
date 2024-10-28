package TextProcessing.Exercises;

import java.util.Scanner;

public class ReplaceRepeatingCharsSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().trim();

        StringBuilder sb = new StringBuilder();

        if(text.length() == 0)
        {
            return;
        }

        char previousChar = text.charAt(0);

        sb.append(previousChar);

        for(int i = 1; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            if(ch != previousChar)
            {
                sb.append(ch);
                previousChar = ch;
            }
        }
        System.out.println(sb);
    }
}
