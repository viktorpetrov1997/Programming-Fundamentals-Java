package Arrays.Exercises;

import java.util.Scanner;

public class ZigZagArraysSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for(int i=1;i<=n;i++)
        {
            String[] numbers = scanner.nextLine().split(" ");
            String firstNumber = numbers[0];
            String secondNumber = numbers[1];
            if(i % 2 != 0)
            {
                firstArray[i-1] = firstNumber;
                secondArray[i-1] = secondNumber;
            }
            else
            {
                firstArray[i-1] = secondNumber;
                secondArray[i-1] = firstNumber;
            }
        }

        for(int i=0;i<firstArray.length;i++)
        {
            System.out.printf(firstArray[i] + " ");
        }

        System.out.println();

        for(int j=0;j<secondArray.length;j++)
        {
            System.out.printf(secondArray[j] + " ");
        }
    }
}
