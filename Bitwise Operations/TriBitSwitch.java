package BitwiseOperations;

import java.util.Scanner;

public class TriBitSwitch
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        int mask = 7 << p;
        int result = n ^ mask;

        System.out.println(result);
    }
}
