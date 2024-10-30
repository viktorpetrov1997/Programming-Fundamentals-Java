package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSumSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] secondArray = numbers;

        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = i + 1; j < numbers.length; j++)
            {
                if(numbers[i] + secondArray[j] == n)
                {
                    System.out.printf(numbers[i] + " " + secondArray[j]);
                    System.out.println();
                }
            }
        }
    }
}
