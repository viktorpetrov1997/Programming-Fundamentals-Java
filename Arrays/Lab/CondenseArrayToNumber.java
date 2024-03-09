package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] condensed = new int[numbersArr.length - 1];

        for(int i = 0; i < numbersArr.length; i++)
        {
            if(numbersArr.length == 1)
            {
                break;
            }

            if(i == numbersArr.length - 1)
            {
                int[] condensedNew = new int[condensed.length - 1];
                i = -1;
                numbersArr = condensed;
                condensed = condensedNew;
            }
            else
            {
                condensed[i] = numbersArr[i] + numbersArr[i + 1];
            }
        }

        System.out.println(numbersArr[0]);
    }
}
