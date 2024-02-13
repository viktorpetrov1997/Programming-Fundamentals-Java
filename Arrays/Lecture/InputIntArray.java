package Arrays.Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class InputIntArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
