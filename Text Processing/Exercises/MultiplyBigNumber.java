package TextProcessing.Exercises;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String bigNumber = scanner.nextLine().replaceFirst("^0+(?!$)", "");
        int oneDigitNumber = Integer.parseInt(scanner.nextLine());
        StringBuilder finalNum = new StringBuilder();

        int decimalReminder = 0;

        if (bigNumber.isEmpty())
        {
            bigNumber = "0";
        }

        if (oneDigitNumber == 0)
        {
            System.out.println(0);
            return;
        }

        for (int i = bigNumber.length() - 1; i >= 0; i--)
        {
            int num = (int) bigNumber.charAt(i) - 48;
            int currentSum = num * oneDigitNumber;
            currentSum += decimalReminder;
            finalNum.append(currentSum % 10);
            decimalReminder = currentSum / 10;
        }

        if (decimalReminder > 0)
        {
            finalNum.append(decimalReminder);
        }

        System.out.println(finalNum.reverse());
    }
}
