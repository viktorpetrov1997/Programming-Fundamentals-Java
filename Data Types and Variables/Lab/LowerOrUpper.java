package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class LowerOrUpper
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        char character = scanner.next().charAt(0);
        if(Character.isUpperCase(character))
        {
            System.out.println("upper-case");
        }
        else
        {
            System.out.println("lower-case");
        }
    }
}
