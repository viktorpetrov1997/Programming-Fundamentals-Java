package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("End"))
        {
            String[] commandArray = input.split(" ");
            String command = commandArray[0];
            if(command.equals("Add"))
            {
                numbers.add(Integer.parseInt(commandArray[1]));
            }
            else if(command.equals("Insert"))
            {
                int index = Integer.parseInt(commandArray[2]);
                if(index >=0 && index < numbers.size())
                {
                    int element = Integer.parseInt(commandArray[1]);
                    numbers.add(index,element);
                }
                else
                {
                    System.out.println("Invalid index");
                }
            }
            else if(command.equals("Remove"))
            {
                int index = Integer.parseInt(commandArray[1]);
                if(index >=0 && index < numbers.size())
                {
                    numbers.remove(index);
                }
                else
                {
                    System.out.println("Invalid index");
                }
            }
            else if(command.equals("Shift"))
            {
                String direction = commandArray[1];
                int count = Integer.parseInt(commandArray[2]);
                if(direction.equals("left"))
                {
                    for (int i = 0; i < count; i++)
                    {
                        numbers.add(numbers.get(0));
                        numbers.remove(numbers.get(0));
                    }
                }
                else if(direction.equals("right"))
                {
                    for (int i = 0; i < count; i++)
                    {
                        numbers.add(0,numbers.get(numbers.size() - 1));
                        numbers.remove(numbers.size() - 1);
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
