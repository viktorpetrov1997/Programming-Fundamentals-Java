package DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class DecryptingMessage
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for(int i=0;i<n;i++)
        {
            char character = (char) (scanner.next().charAt(0) + key);
            System.out.print(character);
        }
    }
}
