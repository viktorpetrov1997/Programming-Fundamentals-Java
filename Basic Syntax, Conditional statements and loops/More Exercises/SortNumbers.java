package basic.syntax.more.exercises;

import java.util.Scanner;

public class SortNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int maxNumber = Math.max(firstNumber,Math.max(secondNumber,thirdNumber));
        int minNumber = Math.min(firstNumber,Math.min(secondNumber,thirdNumber));
        int middleNumber = firstNumber + secondNumber + thirdNumber - maxNumber - minNumber;

        System.out.println(maxNumber);
        System.out.println(middleNumber);
        System.out.println(minNumber);
    }
}
