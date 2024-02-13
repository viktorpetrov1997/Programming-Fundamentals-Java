package Methods.Exercises;

import java.util.Scanner;

public class NxNMatrix
{
    private static void printLine(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++)
        {
            printLine(num);
        }
    }
}
