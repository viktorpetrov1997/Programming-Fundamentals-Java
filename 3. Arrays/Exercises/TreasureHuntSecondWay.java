package Arrays.Exercises;

import java.util.Scanner;

public class TreasureHuntSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");

        String input = scanner.nextLine();
        while(!input.equals("Yohoho!"))
        {
            String[] commandArr = input.split(" ");
            String command = commandArr[0];
            if(command.equals("Loot"))
            {
                for(int i = 1; i < commandArr.length; i++)
                {
                    boolean containsItem = false;
                    for(int j = 0; j < treasureChest.length; j++)
                    {
                        if(commandArr[i].equals(treasureChest[j]))
                        {
                            containsItem = true;
                            break;
                        }
                    }
                    if(!containsItem)
                    {
                        String[] newItemsInChest = new String[treasureChest.length + 1];
                        newItemsInChest[0] = commandArr[i];
                        for(int k = 0; k < treasureChest.length; k++)
                        {
                            newItemsInChest[k+1] = treasureChest[k];
                        }
                        treasureChest = newItemsInChest;
                    }
                }
            }
            else if(command.equals("Drop"))
            {
                int index = Integer.parseInt(commandArr[1]);
                if(index >= 0 && index < treasureChest.length)
                {
                    String droppedItem = treasureChest[index];
                    for(int i = index; i < treasureChest.length - 1; i++)
                    {
                        treasureChest[i] = treasureChest[i + 1];
                    }
                    treasureChest[treasureChest.length - 1] = droppedItem;
                }
            }
            else if(command.equals("Steal"))
            {
                int count = Integer.parseInt(commandArr[1]);
                int startIndex = 0;
                if(treasureChest.length > count)
                {
                    startIndex = treasureChest.length - count;
                }

                for(int i = startIndex; i < treasureChest.length; i++)
                {
                    System.out.print(treasureChest[i]);
                    if(i < treasureChest.length - 1)
                    {
                        System.out.print(", ");
                    }
                }

                if(treasureChest.length > count)
                {
                    String[] newArray = new String[treasureChest.length - count];
                    for(int i = 0; i < startIndex; i++)
                    {
                        newArray[i] = treasureChest[i];
                    }
                    treasureChest = newArray;
                }
                else
                {
                    treasureChest = new String[0];
                }
            }
            input = scanner.nextLine();
        }

        double sumOfLengths = 0;

        for(int i = 0; i < treasureChest.length; i++)
        {
            sumOfLengths += treasureChest[i].length();
        }

        if(treasureChest.length == 0)
        {
            System.out.println("\nFailed treasure hunt.");
        }
        else
        {
            System.out.printf("\nAverage treasure gain: %.2f pirate credits.",sumOfLengths / treasureChest.length);
        }
    }
}
