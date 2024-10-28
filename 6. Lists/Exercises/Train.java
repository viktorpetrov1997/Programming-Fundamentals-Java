package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while(!input.equals("end"))
        {
            String[] commandArray = input.split(" ");
            String command = commandArray[0];
            if(command.equals("Add"))
            {
                numbers.add(Integer.parseInt(commandArray[1]));
            }
            else
            {
                for(int i = 0; i < numbers.size(); i++)
                {
                    if(numbers.get(i) + Integer.parseInt(commandArray[0]) <= maxCapacity)
                    {
                        numbers.set(i, numbers.get(i) + Integer.parseInt(commandArray[0]));
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for(int i = 0; i <numbers.size() ; i++)
        {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
