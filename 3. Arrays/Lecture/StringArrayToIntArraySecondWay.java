package Arrays.Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayToIntArraySecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int[] numbersArr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
