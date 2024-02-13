package BitwiseOperations;

import java.util.Scanner;

public class BitDestroyer
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        int mask = ~(1 << p);
        int newNumber = n & mask;

        System.out.println(newNumber);
    }
}
