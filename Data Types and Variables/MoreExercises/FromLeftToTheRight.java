package DataTypesAndVariables.MoreExercises;

import java.math.BigDecimal;
import java.util.Scanner;

public class FromLeftToTheRight
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        String leftNumber = "";
        String rightNumber = "";
        int indexOfBlankSpace = 0;
        for(int i=0;i<lines;i++)
        {
            String twoNumbers = scanner.nextLine();
            for(int j=0;j<twoNumbers.length();j++)
            {
                if(twoNumbers.charAt(j) == ' ')
                {
                    indexOfBlankSpace = j;
                    break;
                }
                else
                {
                    leftNumber += twoNumbers.charAt(j);
                }
            }
            rightNumber = twoNumbers.substring(indexOfBlankSpace + 1);
            long leftNum = Long.parseLong(leftNumber);
            long rightNum = Long.parseLong(rightNumber);
            if(leftNum > rightNum)
            {
                int sumOfDigits = 0;
                while(leftNum != 0)
                {
                    sumOfDigits += leftNum % 10;
                    leftNum /= 10;
                }
                System.out.println(Math.abs(sumOfDigits));
            }
            else
            {
                int sumOfDigits = 0;
                while(rightNum != 0)
                {
                    sumOfDigits += rightNum % 10;
                    rightNum /= 10;
                }
                System.out.println(Math.abs(sumOfDigits));
            }
            leftNumber = "";
            rightNumber = "";
        }
    }
}
