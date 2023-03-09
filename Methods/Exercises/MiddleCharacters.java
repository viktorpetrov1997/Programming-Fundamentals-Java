package methods.exercises;

import java.util.Scanner;

public class MiddleCharacters
{
    private static void printMiddleCharacter(String str)
    {
        int length = str.length();
        int middleCharacter = str.length() / 2;
        if(length % 2 == 0)
        {
            System.out.println(str.substring(middleCharacter - 1,middleCharacter + 1));
            //System.out.println(str.charAt(middleCharacter - 1) + "" + str.charAt(middleCharacter)); vtori nachin
        }
        else
        {
            System.out.println(str.charAt(middleCharacter));
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        printMiddleCharacter(string);
    }
}
