package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        while(!command.equals("end"))
        {
            if(command.contains("swap"))
            {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int firstElement = numbers[index1];
                int secondElement = numbers[index2];
                numbers[index1] = secondElement;
                numbers[index2] = firstElement;
            }
            else if(command.contains("multiply"))
            {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int firstElement = numbers[index1];
                int secondElement = numbers[index2];
                numbers[index1] = firstElement * secondElement;
            }
            else if(command.contains("decrease"))
            {
                for(int i = 0; i < numbers.length; i++)
                {
                    numbers[i] -= 1;
                }
            }
            command = scanner.nextLine();
        }

        for(int i = 0; i < numbers.length; i++)
        {
            if(i == numbers.length - 1)
            {
                System.out.print(numbers[i] );
            }
            else
            {
                System.out.print(numbers[i] + ", ");
            }
        }
    }
}
