package Methods.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator
{
    private static void lastCountElements(int[] numbers, int count, String command)
    {
        if (count < 0 || count > numbers.length)
        {
            System.out.println("Invalid count");
            return;
        }

        int num = command.equals("even") ? 0 : 1; //sukratena if proverka na edin red dali command e even ili odd

        int index = 0;
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length ; i++)
        {
            if (numbers[i] % 2 == num)
            {
                result[index++] = numbers[i];
            }
        }

        if (index == 0)
        {
            System.out.println("[]");

        } else
        {
            int startIndex = index - count;
            if (startIndex < 0)
            {
                startIndex = 0;
            }
            String output = "[";
            for (int i = startIndex; i < index ; i++)
            {

                if (i < index - 1)
                {
                    output += result[i] + ", ";
                }
                else
                {
                    output += result[i] + "]";
                }
            }
            System.out.println(output);
        }
    }

    private static void minOdd(int[] numbers)
    {
        int minOdd = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 != 0 && numbers[i] <= minOdd)
            {
                minOdd = numbers[i];
                minIndex = i;
            }
        }

        if (minIndex == -1)
        {
            System.out.println("No matches");
        }
        else
        {
            System.out.println(minIndex);
        }
    }

    private static void minEven(int[] numbers)
    {
        int minEven = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 == 0 && numbers[i] <= minEven)
            {
                minEven = numbers[i];
                minIndex = i;
            }
        }

        if (minIndex == -1)
        {
            System.out.println("No matches");
        }
        else
        {
            System.out.println(minIndex);
        }
    }

    private static void maxOdd(int[] numbers)
    {
        int maxOdd = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < numbers.length ; i++)
        {
            if (numbers[i] % 2 != 0 && numbers[i] >= maxOdd )
            {
                maxOdd = numbers[i];
                maxIndex = i;
            }
        }
        if (maxIndex == -1)
        {
            System.out.println("No matches");
        }
        else
        {
            System.out.println(maxIndex);
        }
    }

    private static void maxEven(int[] numbers)
    {
        int maxEven = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < numbers.length ; i++)
        {
            if (numbers[i] % 2 == 0 && numbers[i] >= maxEven )
            {
                maxEven = numbers[i];
                maxIndex = i;
            }
        }

        if (maxIndex == -1)
        {
            System.out.println("No matches");
        }
        else
        {
            System.out.println(maxIndex);
        }
    }

    private static int[] exchange(int[] numbers, String s)
    {
        int index = Integer.parseInt(s);

        if (index < 0 || index >= numbers.length)
        {
            System.out.println("Invalid index");
        }
        else
        {
            int count = 0;
            int [] result = new int[numbers.length];

            for (int i = index + 1; i < numbers.length ; i++)
            {
                result[count++] = numbers[i];
            }
            for (int i = 0; i <= index ; i++)
            {
                result[count++] = numbers[i];
            }
            numbers = result;
        }
        return numbers;
    }

    private static void firstCountElements(int[] numbers, int count, String command)
    {
        if (count < 0 || count > numbers.length)
        {
            System.out.println("Invalid count");
            return;
        }

        int num = command.equals("even") ? 0 : 1;

        int index = 0;
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length ; i++)
        {
            if (numbers[i] % 2 == num)
            {
                result[index++] = numbers[i];

                if (index == count)
                {
                    break;
                }
            }
        }

        if (index == 0)
        {
            System.out.println("[]");

        }
        else
        {
            String output = "[";
            for (int i = 0; i < index ; i++)
            {
                if (i < index - 1)
                {
                    output += result[i] + ", ";
                }
                else
                {
                    output += result[i] + "]";
                }
            }
            System.out.println(output);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input = "";

        while(!"end".equals(input = scanner.nextLine()))
        {
            String[] command = input.split("\\s+");

            if ("exchange".equals(command[0]))
            {
                numbers = exchange(numbers, command[1]);

            }
            else if ("max".equals(command[0]))
            {
                if ("even".equals(command[1]))
                {
                    maxEven(numbers);

                }
                else if ("odd".equals(command[1]))
                {
                    maxOdd(numbers);
                }
            }
            else if ("min".equals(command[0]))
            {
                if ("even".equals(command[1]))
                {
                    minEven(numbers);
                }
                else if ("odd".equals(command[1]))
                {
                    minOdd(numbers);
                }

            }
            else if ("first".equals(command[0]))
            {
                firstCountElements(numbers, Integer.parseInt(command[1]), command[2]);

            }
            else  if ("last".equals(command[0]))
            {
                lastCountElements(numbers, Integer.parseInt(command[1]), command[2]);
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
