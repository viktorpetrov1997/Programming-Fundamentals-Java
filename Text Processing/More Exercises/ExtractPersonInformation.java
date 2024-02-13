package TextProcessing.MoreExercises;

import java.util.Scanner;

public class ExtractPersonInformation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int nameStartIndex = 0;
        int nameEndIndex = 0;

        int ageStartIndex = 0;
        int ageEndIndex = 0;

        for(int i = 0; i < n; i++)
        {
            String text = scanner.nextLine();

            for (int j = 0; j < text.length(); j++)
            {
                if(text.charAt(j) == '@')
                {
                    nameStartIndex = j + 1;
                }
                else if(text.charAt(j) == '|')
                {
                    nameEndIndex = j;
                }
                else if(text.charAt(j) == '#')
                {
                    ageStartIndex = j + 1;
                }
                else if(text.charAt(j) == '*')
                {
                    ageEndIndex = j;
                }
            }
            String name = text.substring(nameStartIndex,nameEndIndex);
            String age = text.substring(ageStartIndex,ageEndIndex);
            System.out.println(name + " is " + age + " years old.");
        }
    }
}
