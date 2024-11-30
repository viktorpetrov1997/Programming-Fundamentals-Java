package Arrays.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<String> itemsList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("Yohoho!"))
        {
            String[] commandArr = input.split(" ");
            String command = commandArr[0];
            if(command.equals("Loot"))
            {
                for(int i = 1; i < commandArr.length; i++)
                {
                    if(!itemsList.contains(commandArr[i]))
                    {
                        itemsList.add(0,commandArr[i]);
                    }
                }
            }
            else if(command.equals("Drop"))
            {
                int index = Integer.parseInt(commandArr[1]);
                if(index >= 0 && index < itemsList.size())
                {
                    itemsList.add(itemsList.get(index));
                    itemsList.remove(index);
                }
            }
            else if(command.equals("Steal"))
            {
                int count = Integer.parseInt(commandArr[1]);
                int startIndex = 0;
                if(itemsList.size() < count)
                {
                    startIndex = 0;
                }
                else
                {
                    startIndex = itemsList.size() - count;
                }

                for(int i = startIndex; i < itemsList.size(); i++)
                {
                    System.out.print(itemsList.get(i));
                    if(i < itemsList.size() - 1)
                    {
                        System.out.print(", ");
                    }
                }

                itemsList.subList(startIndex, itemsList.size()).clear();
                System.out.println();
                /*
                int count = Integer.parseInt(commandArr[1]);
                count = Math.min(count, itemsList.size());
                List<String> stolenItems = new ArrayList<>(itemsList.subList(itemsList.size() - count, itemsList.size()));
                itemsList.removeAll(stolenItems);
                System.out.print(String.join(", ", stolenItems));
                System.out.println();
                */
            }
            input = scanner.nextLine();
        }

        double sumOfLengths = 0;

        for(int i = 0; i < itemsList.size(); i++)
        {
            sumOfLengths += itemsList.get(i).length();
        }

        if(itemsList.isEmpty())
        {
            System.out.println("Failed treasure hunt.");
        }
        else
        {
            System.out.printf("Average treasure gain: %.2f pirate credits.",sumOfLengths / itemsList.size());
        }
    }
}