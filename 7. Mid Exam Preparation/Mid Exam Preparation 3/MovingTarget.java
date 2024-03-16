package MidExamPreparation.MidExamPreparationThree;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("End"))
        {
            String[] commandArray = input.split(" ");
            String command = commandArray[0];
            if(command.equals("Shoot"))
            {
                int index = Integer.parseInt(commandArray[1]);
                int power = Integer.parseInt(commandArray[2]);
                if(index >= 0 && index < targets.size())
                {
                    targets.set(index, targets.get(index) - power);
                    if(targets.get(index) <= 0)
                    {
                        targets.remove(index);
                    }
                }
            }
            else if(command.equals("Add"))
            {
                int index = Integer.parseInt(commandArray[1]);
                int value = Integer.parseInt(commandArray[2]);
                if(index >= 0 && index < targets.size())
                {
                    targets.add(index,value);
                }
                else
                {
                    System.out.println("Invalid placement!");
                }
            }
            else if(command.equals("Strike"))
            {
                int index = Integer.parseInt(commandArray[1]);
                int radius = Integer.parseInt(commandArray[2]);
                int startIndex = index - radius;
                int endIndex = index + radius;
                int numberOfElements = (radius * 2) + 1;
                int count = 0;
                if(index < 0 || index > targets.size() - 1 || startIndex < 0 || endIndex > targets.size() - 1)
                {
                    System.out.println("Strike missed!");
                }
                else
                {
                    for (int i = startIndex; i <= endIndex ; i++)
                    {
                        targets.remove(i);
                        ++count;
                        --i;
                        if(count == numberOfElements) break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < targets.size(); i++)
        {
            if(i < targets.size() - 1)
            {
                System.out.print(targets.get(i) + "|");
            }
            else
            {
                System.out.print(targets.get(i));
            }
        }
    }
}
