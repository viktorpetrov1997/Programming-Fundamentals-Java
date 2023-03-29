package arrays.more.exercises;

import java.util.Scanner;

public class RecursiveFibonacci
{
    private static long[] fibonacciCache; //tozi masiv e suzdaden za da zapazva stoinostite na masivite i da uvelichi skorosta na programata(memorization)

    private static long GetFibonacci(int n)
    {
        if(n <= 1) return n;

        if(fibonacciCache[n] != 0)
        {
            return  fibonacciCache[n];
        }

        long nthFibonacciCache = GetFibonacci(n - 1) + GetFibonacci(n - 2);
        fibonacciCache[n] = nthFibonacciCache;

        return nthFibonacciCache;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        fibonacciCache = new long[n + 1];

        System.out.print(GetFibonacci(n)); //printing only the fibonacci number at this position

        /*long n = Integer.parseInt(scanner.nextLine());

        for(int i=1;i<=n;i++)
        {
            System.out.print(GetFibonacci(i) + " ");
        }*/ //way of printing fibonacci numbers in one range from start to finish
    }
}
