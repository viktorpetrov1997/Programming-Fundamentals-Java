package MidExamPreparation.MidExamPreparationOne;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<String> itemsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("Craft!"))
        {
            String[] commandArr = input.split(" - ");
            String command = commandArr[0];

            switch (command)
            {
                case "Collect":
                    String addItem = commandArr[1];
                    if(!itemsList.contains(addItem))
                    {
                        itemsList.add(addItem);
                    }
                    break;
                case "Drop":
                    String removeItem = commandArr[1];
                    itemsList.remove(removeItem);
                    break;
                case "Combine Items":
                    String[] items = commandArr[1].split(":");
                    String oldItem = items[0];
                    String newItem = items[1];
                    if(itemsList.contains(oldItem))
                    {
                        int indexOldItem = itemsList.indexOf(oldItem);
                        itemsList.add(indexOldItem + 1,newItem);
                    }
                    break;
                case "Renew":
                    String renewItem = commandArr[1];
                    if(itemsList.contains(renewItem))
                    {
                        itemsList.remove(renewItem);
                        itemsList.add(renewItem);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(", ",itemsList));
    }
}