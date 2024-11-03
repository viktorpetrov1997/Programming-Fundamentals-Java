package BitwiseOperations.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class OddTimes
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int result = 0;

        for(int i = 0; i < numbers.length; i++)
        {
            result ^= numbers[i];
        }

        System.out.println(result);
    }
}
