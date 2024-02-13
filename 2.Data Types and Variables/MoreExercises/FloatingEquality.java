package DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class FloatingEquality
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double eps = 0.000001;
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        double difference = Math.abs(firstNumber - secondNumber);

        if(difference < eps)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
