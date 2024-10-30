package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSumsSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isEqual = false;
        int equalityIndex = 0;

        for(int i = 0; i < numbers.length; i++)
        {
            int sumLeftSide = 0;
            int sumRightSide = 0;

            for(int left = 0; left < i; left++)
            {
                sumLeftSide += numbers[left];
            }

            for(int right = i + 1; right < numbers.length; right++)
            {
                sumRightSide += numbers[right];
            }

            if(sumLeftSide == sumRightSide)
            {
                isEqual = true;
                equalityIndex = i;
                break;
            }
            else
            {
                sumLeftSide = 0;
                sumRightSide = 0;
                isEqual = false;
            }
        }
        if(isEqual)
        {
            System.out.println(equalityIndex);
        }
        else
        {
            System.out.println("no");
        }
    }
}
