package TextProcessing.Exercises;

import java.util.Scanner;

public class ReplaceRepeatingChars
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        for(int i = 0; i < text.length(); i++)
        {
            int countEqualChars = 0;
            for (int j = i+1; j < text.length(); j++)
            {
                if(text.charAt(i) == text.charAt(j))
                {
                    ++countEqualChars;
                    if(j == text.length() - 1)
                    {
                        if(countEqualChars >= 1)
                        {
                            text.replace(i, i + countEqualChars, "");
                            break;
                        }
                    }
                }
                else
                {
                    if(countEqualChars >= 1)
                    {
                        text.replace(i, i + countEqualChars, "");
                        break;
                    }
                    else break;
                }
            }
        }
        System.out.println(text);
    }
}
