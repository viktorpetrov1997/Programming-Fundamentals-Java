package Methods.Exercises;

import java.util.Scanner;

public class CharactersInRange
{
    private static void charactersInRange(char a, char b)
    {
        if(a < b)
        {
            for(char i = (char) (a + 1); i<b; i++)
            {
                System.out.print(i + " ");
            }
        }
        else
        {
            for(char i = (char) (b + 1); i<a; i++)
            {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);

        charactersInRange(a,b);
    }
}