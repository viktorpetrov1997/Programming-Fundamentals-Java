package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<String> treasureChest = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("Yohoho!"))
        {
            String[] commandArray = input.split(" ");
            String command = commandArray[0];
            if(command.equals("Loot"))
            {
                for (int i = 1; i < commandArray.length; i++)
                {
                    if(!treasureChest.contains(commandArray[i]))
                    {
                        treasureChest.add(0,commandArray[i]);
                    }
                }
            }
            else if(command.equals("Drop"))
            {
                int index = Integer.parseInt(commandArray[1]);
                if(index >= 0 && index < treasureChest.size())
                {
                    String item = treasureChest.get(index);
                    treasureChest.remove(index);
                    treasureChest.add(item);
                }
            }
            else if(command.equals("Steal"))
            {
                int count = Integer.parseInt(commandArray[1]);

                if (count > treasureChest.size())
                {
                    count = treasureChest.size();
                }

                List<String> subList = treasureChest.subList(treasureChest.size() - count, treasureChest.size());

                System.out.println(String.join(", ", subList));

                treasureChest = treasureChest.subList(0, treasureChest.size() - count);
            }
            input = scanner.nextLine();
        }
        if(!treasureChest.isEmpty())
        {
            int sum = 0;
            for (int i = 0; i < treasureChest.size(); i++)
            {
                sum += treasureChest.get(i).length();
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.",sum * 1.0 / treasureChest.size());
        }
        else
        {
            System.out.println("Failed treasure hunt.");
        }
    }
}
