package Arrays.MoreExercises;

import java.util.Scanner;

public class FibonacciTestNotIncludesInExercises
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int n1 = 1;
        int n2 = 1;
        int n3 = 0;

        System.out.print(n1 + " " + n2 + " ");

        for(int i = 2; i < number; i++)
        {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}
