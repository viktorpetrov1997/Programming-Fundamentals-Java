package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegersSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isBigger = false;

        for(int i=0;i<numbers.length;i++)
        {
            if(i == numbers.length - 1)
            {
                System.out.printf(numbers[i] + " ");
                break;
            }
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i] > numbers[j])
                {
                    isBigger = true;
                }
                else
                {
                    isBigger = false;
                    break;
                }
            }
            if(isBigger)
            {
                System.out.printf(numbers[i] + " ");
            }
        }
    }
}
