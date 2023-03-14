import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++)
        {
            String input = scanner.nextLine();
            String[] commandArray = input.split(" ");
            String name = commandArray[0];
            if(commandArray[2].equals("going!"))
            {
                boolean isAlreadyInList = false;
                for (int j = 0; j < names.size(); j++)
                {
                    if(names.get(j).equals(name))
                    {
                        System.out.println(name + " is already in the list!");
                        isAlreadyInList = true;
                        break;
                    }
                }
                if(!isAlreadyInList)
                {
                    names.add(name);
                }
            }
            else
            {
                boolean isInList = false;
                for (int j = 0; j < names.size(); j++)
                {
                    if(names.get(j).equals(name))
                    {
                        isInList = true;
                        break;
                    }
                }
                if(!isInList)
                {
                    System.out.println(name + " is not in the list!");
                }
                else
                {
                    names.remove(name);
                }
            }
        }
        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }
    }
}
