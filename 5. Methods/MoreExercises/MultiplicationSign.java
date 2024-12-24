package Methods.MoreExercises;

import java.util.Scanner;

public class MultiplicationSign
{
    private static void printProduct(int[] numbers)
    {
        boolean hasNegativeNumber = false;
        int countNegativeNumbers = 0;

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i] == 0)
            {
                System.out.println("zero");
                return;
            }
            else if(numbers[i] < 0)
            {
                hasNegativeNumber = true;
                ++countNegativeNumbers;
            }
        }

        if(hasNegativeNumber && (countNegativeNumbers == 1 || countNegativeNumbers == 3))
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("positive");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[3];
        numbers[0] = num1;
        numbers[1] = num2;
        numbers[2] = num3;

        printProduct(numbers);
    }
}
