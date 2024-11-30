package Arrays.MoreExercises;

import java.util.Scanner;

public class RecursiveFibonacciSecondWay
{
    private static long GetFibonacci(int n)
    {
        if (n <= 1) return n; // Base case: return 0 or 1 for Fibonacci(0) or Fibonacci(1)

        // Recursive calculation without memoization
        return GetFibonacci(n - 1) + GetFibonacci(n - 2);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // Read input for Fibonacci index

        System.out.print(GetFibonacci(n)); // Output the nth Fibonacci number

        /*
        for(int i = 1; i <= n; i++)
        {
            System.out.print(GetFibonacci(i) + " ");
        }
        */ // prints the Fibonacci sequence from 1 to n
    }
}