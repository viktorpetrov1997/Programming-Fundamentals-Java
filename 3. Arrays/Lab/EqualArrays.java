package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxLength = Math.max(firstArr.length, secondArr.length);

        int sum = 0;
        boolean areNotIdentical = false;

        for(int i = 0; i < maxLength; i++)
        {
            sum += firstArr[i];

            if(firstArr[i] != secondArr[i])
            {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areNotIdentical = true;
                break;
            }
        }

        if(!areNotIdentical)
        {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
