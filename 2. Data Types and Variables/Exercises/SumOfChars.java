package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class SumOfChars
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int count = 1; count <= n; count++)
        {
            char symbol = scanner.nextLine().charAt(0);
            sum += (int)symbol;
        }

        System.out.println("The sum equals: " + sum);
    }
}
