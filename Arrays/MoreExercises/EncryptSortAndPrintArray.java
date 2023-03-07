package arrays.more.exercises;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfStrings = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int[] codes = new int[numberOfStrings];
        for (int i = 0; i < numberOfStrings; i++)
        {
            String str = scanner.nextLine();
            for (int j = 0; j < str.length(); j++)
            {
                if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o'
                        || str.charAt(j) == 'u' || str.charAt(j) == 'A' || str.charAt(j) == 'E' || str.charAt(j) == 'I'
                        || str.charAt(j) == 'O' || str.charAt(j) == 'U')
                {
                    sum += str.charAt(j) * str.length();
                }
                else
                {
                    sum += str.charAt(j) / str.length();
                }
            }
            codes[i] = sum;
            sum = 0;
        }

        Arrays.sort(codes);

        /*for (int i = 0; i < codes.length; i++)
        {
            for (int j = i + 1; j < codes.length; j++)
            {
                int tmp = 0;
                if (codes[i] > codes[j])
                {
                    tmp = codes[i];
                    codes[i] = codes[j];
                    codes[j] = tmp;
                }
            }
        }*/

        for (int i = 0; i < codes.length; i++)
        {
            System.out.println(codes[i]);
        }
    }
}

