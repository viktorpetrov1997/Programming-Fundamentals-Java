package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("end"))
        {
            String[] commandArr = input.split(" ");
            String command = commandArr[0];
            if(command.equals("Add"))
            {
                numbersList.add(Integer.parseInt(commandArr[1]));
            }
            else if(command.equals("Remove"))
            {
                numbersList.remove(Integer.valueOf(Integer.parseInt(commandArr[1]))); //taka shte go razchete kato element, a ne kato index
            }
            else if(command.equals("RemoveAt"))
            {
                numbersList.remove(Integer.parseInt(commandArr[1]));
            }
            else if(command.equals("Insert"))
            {
                int numberToInsert = Integer.parseInt(commandArr[1]);
                int indexToInsert = Integer.parseInt(commandArr[2]);
                numbersList.add(indexToInsert,numberToInsert);
            }
            input = scanner.nextLine();
        }

        for(int i=0;i<numbersList.size();i++)
        {
            System.out.print(numbersList.get(i) + " ");
        }
    }
}