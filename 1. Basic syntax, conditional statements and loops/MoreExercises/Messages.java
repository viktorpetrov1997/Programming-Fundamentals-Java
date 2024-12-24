package BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class Messages
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String word = "";

        for(int i=0;i<number;i++)
        {
            String code = scanner.nextLine();
            int numberOfDigits = code.length();
            int mainDigit = Integer.parseInt(String.valueOf(code.charAt(0)));
            int offset = (mainDigit - 2) * 3;
            if(mainDigit == 8 || mainDigit == 9)
            {
                offset += 1;
            }
            int latterIndex = offset + numberOfDigits - 1;

            char ascii = (char) ('a' + latterIndex);
            if(code.equals("0"))
            {
                word += " ";
            }
            else
            {
                word += ascii;
            }
        }
        System.out.println(word);
    }
}