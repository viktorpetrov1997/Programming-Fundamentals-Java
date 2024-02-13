package Arrays.Lecture;

import java.util.Scanner;

public class StringArrayToIntArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] valuesArr = str.split(" ");

        int[] numbersArr = new int[valuesArr.length];
        for(int i=0;i<valuesArr.length;i++)
        {
            numbersArr[i] = Integer.parseInt(valuesArr[i]);
        }
    }
}
