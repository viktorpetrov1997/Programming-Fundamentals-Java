package methods.exercises;

import java.util.Scanner;

public class FactorialDivision
{
    private static long calculateFactorial(int number)
    {
        long fact = 1;
        for(int i=1;i<=number;i++)
        {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long firstFactorial = calculateFactorial(firstNumber);
        long secondFactorial = calculateFactorial(secondNumber);

        double result = firstFactorial * 1.0 / secondFactorial;
        System.out.printf("%.2f",result);
    }
}
