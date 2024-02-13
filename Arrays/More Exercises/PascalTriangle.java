package Arrays.MoreExercises;

import java.util.Scanner;

public class PascalTriangle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int line = 1; line <= n; line++)
        {
            int C = 1;
            for (int i = 1; i <= line; i++)
            {
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }
}
