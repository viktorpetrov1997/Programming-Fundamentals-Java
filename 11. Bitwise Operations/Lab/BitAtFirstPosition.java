package BitwiseOperations.Lab;

import java.util.Scanner;

public class BitAtFirstPosition
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder binary = new StringBuilder();
        while(n > 0)
        {
            int digit = n % 2;
            binary.append(digit);
            n /= 2;
        }
        System.out.println(binary.length() >= 2 ? binary.charAt(1) : '0');
    }
}
