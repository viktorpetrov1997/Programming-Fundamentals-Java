package arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElementsSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int maxLength = 0;
        int length = 1;

        int startIndex = 0;
        int bestStart = 0;

        for(int i=0;i<array.length;i++)
        {
            if(i != array.length - 1)
            {
                if(array[i] == array[i + 1])
                {
                    ++length;
                    if(length == 2)
                    {
                        startIndex = i;
                    }
                }
                else
                {
                    length = 1;
                }
            }

            if(length > maxLength)
            {
                maxLength = length;
                bestStart = startIndex;
            }
        }

        for (int i = bestStart; i < bestStart + maxLength; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
