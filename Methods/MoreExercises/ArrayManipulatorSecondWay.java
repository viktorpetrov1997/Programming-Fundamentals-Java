package methods.more.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulatorSecondWay
{
    private static int[] exchange(int[] numbers, int index)
    {
        if(index < 0 || index > numbers.length - 1)
        {
            System.out.println("Invalid index");
        }
        else
        {
            int[] newArray = new int[numbers.length];

            int newArrayIndex = 0;
            for(int i=index + 1;i<numbers.length;i++)
            {
                newArray[newArrayIndex++] = numbers[i];
            }

            for(int i=0;i<=index;i++)
            {
                newArray[newArrayIndex++] = numbers[i];
            }
            numbers = newArray;
        }
        return numbers;
    }

    private static void max(int[] numbers, String command)
    {
        int maxNumber = Integer.MIN_VALUE;
        int maxIndex = -1;
        if(command.equals("even"))
        {
            for(int i=0;i<numbers.length;i++)
            {
                if(numbers[i] % 2 == 0 && numbers[i] >= maxNumber)
                {
                    maxIndex = i;
                    maxNumber = numbers[i];
                }
            }
        }
        else if(command.equals("odd"))
        {
            for(int i=0;i<numbers.length;i++)
            {
                if(numbers[i] % 2 != 0 && numbers[i] >= maxNumber)
                {
                    maxIndex = i;
                    maxNumber = numbers[i];
                }
            }
        }
        if(maxIndex == -1)
        {
            System.out.println("No matches");
        }
        else
        {
            System.out.println(maxIndex);
        }
    }

    private static void min(int[] numbers, String command)
    {
        int minNumber = Integer.MAX_VALUE;
        int minIndex = -1;
        if(command.equals("even"))
        {
            for(int i=0;i<numbers.length;i++)
            {
                if(numbers[i] % 2 == 0 && numbers[i] <= minNumber)
                {
                    minIndex = i;
                    minNumber = numbers[i];
                }
            }
        }
        else if(command.equals("odd"))
        {
            for(int i=0;i<numbers.length;i++)
            {
                if(numbers[i] % 2 != 0 && numbers[i] <= minNumber)
                {
                    minIndex = i;
                    minNumber = numbers[i];
                }
            }
        }
        if(minIndex == -1)
        {
            System.out.println("No matches");
        }
        else
        {
            System.out.println(minIndex);
        }
    }

    private static void printFirstEvenOrOdd(int number[], int count, String command)
    {
        if(count < 0 || count > number.length)
        {
            System.out.println("Invalid count");
            return;
        }

        int[] first = new int[number.length];
        int firstIndex = 0;

        if(command.equals("even"))
        {
            for(int i=0;i<number.length;i++)
            {
                if(number[i] % 2 == 0)
                {
                    first[firstIndex++] = number[i];
                    if(firstIndex == count) break;
                }
            }
        }
        else if(command.equals("odd"))
        {
            for(int i=0;i<number.length;i++)
            {
                if(number[i] % 2 != 0)
                {
                    first[firstIndex++] = number[i];
                    if(firstIndex == count) break;
                }
            }
        }
        if(firstIndex == 0)
        {
            System.out.println("[]");
        }
        else
        {
            String output = "[";
            for(int i=0;i<firstIndex;i++)
            {
                if(i != firstIndex - 1)
                {
                    output += first[i] + ", ";
                }
                else
                {
                    output += first[i] + "]";
                }
            }
            System.out.println(output);
        }
    }

    private static void printLastEvenOrOdd(int number[], int count, String command)
    {
        if(count < 0 || count > number.length)
        {
            System.out.println("Invalid count");
            return;
        }

        int[] last = new int[number.length];
        int lastIndex = 0;

        if(command.equals("even"))
        {
            for(int i=number.length - 1;i>=0;i--)
            {
                if(number[i] % 2 == 0)
                {
                    last[lastIndex++] = number[i];
                    if(lastIndex == count) break;
                }
            }
        }
        else if(command.equals("odd"))
        {
            for(int i=number.length - 1;i>=0;i--)
            {
                if(number[i] % 2 != 0)
                {
                    last[lastIndex++] = number[i];
                    if(lastIndex == count) break;
                }
            }
        }
        if(lastIndex == 0)
        {
            System.out.println("[]");
        }
        else
        {
            String output = "[";
            for(int i=lastIndex - 1;i>=0;i--)
            {
                if(i > 0)
                {
                    output += last[i] + ", ";
                }
                else
                {
                    output += last[i] + "]";
                }
            }
            System.out.println(output);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        while(!input.equals("end"))
        {
            String[] commandArray = input.split(" ");
            String command = commandArray[0];
            if(command.equals("exchange"))
            {
                int index = Integer.parseInt(commandArray[1]);
                numbers = exchange(numbers,index);
            }
            else if(command.equals("max"))
            {
                String evenOrOdd = commandArray[1];
                max(numbers,evenOrOdd);
            }
            else if(command.equals("min"))
            {
                String evenOrOdd = commandArray[1];
                min(numbers,evenOrOdd);
            }
            else if(command.equals("first"))
            {
                int count = Integer.parseInt(commandArray[1]);
                String evenOrOdd = commandArray[2];
                printFirstEvenOrOdd(numbers,count,evenOrOdd);
            }
            else if(command.equals("last"))
            {
                int count = Integer.parseInt(commandArray[1]);
                String evenOrOdd = commandArray[2];
                printLastEvenOrOdd(numbers,count,evenOrOdd);
            }
            input = scanner.nextLine();
        }

        System.out.print("[");
        for(int i=0;i<numbers.length;i++)
        {
            if(i != numbers.length - 1)
            {
                System.out.print(numbers[i] + ", ");
            }
            else
            {
                System.out.print(numbers[i]);
            }
        }
        System.out.print("]");
    }
}
