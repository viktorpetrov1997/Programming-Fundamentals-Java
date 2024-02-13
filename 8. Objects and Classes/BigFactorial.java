package ObjectsAndClasses;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        BigInteger factorial = new BigInteger("1");

        for (int i = 1; i <= N; i++)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
