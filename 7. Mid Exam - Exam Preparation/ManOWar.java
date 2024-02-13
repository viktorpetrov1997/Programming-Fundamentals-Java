package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                        .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">"))
                        .map(Integer::parseInt).collect(Collectors.toList());

        int maxHealth = Integer.parseInt(scanner.nextLine());
        boolean hasWinner = false;

        String input = scanner.nextLine();
        while(!input.equals("Retire"))
        {
            String[] commandArray = input.split(" ");
            String command = commandArray[0];
            if(command.equals("Fire"))
            {
                int index = Integer.parseInt(commandArray[1]);
                int damage = Integer.parseInt(commandArray[2]);

                if(index >= 0 && index < warShip.size())
                {
                    warShip.set(index,warShip.get(index) - damage);
                    if(warShip.get(index) <= 0)
                    {
                        System.out.println("You won! The enemy ship has sunken.");
                        hasWinner = true;
                        break;
                    }
                }
            }
            else if(command.equals("Defend"))
            {
                int startIndex = Integer.parseInt(commandArray[1]);
                int endIndex = Integer.parseInt(commandArray[2]);
                int damage = Integer.parseInt(commandArray[3]);

                if((startIndex >= 0 && startIndex < pirateShip.size()) && (endIndex >= 0 && endIndex < pirateShip.size()))
                {
                    for (int i = startIndex; i <= endIndex; i++)
                    {
                        pirateShip.set(i,pirateShip.get(i) - damage);
                        if(pirateShip.get(i) <= 0)
                        {
                            System.out.println("You lost! The pirate ship has sunken.");
                            hasWinner = true;
                            break;
                        }
                    }
                    if(hasWinner) break;
                }
            }
            else if(command.equals("Repair"))
            {
                int index = Integer.parseInt(commandArray[1]);
                int health = Integer.parseInt(commandArray[2]);

                if(index >= 0 && index < pirateShip.size())
                {
                    if(pirateShip.get(index) + health <= maxHealth)
                    {
                        pirateShip.set(index,pirateShip.get(index) + health);
                    }
                    else
                    {
                        pirateShip.set(index,maxHealth);
                    }
                }
            }
            else if(command.equals("Status"))
            {
                double minHealth = maxHealth * 0.2;
                int countSections = 0;
                for (int i = 0; i < pirateShip.size(); i++)
                {
                    if(pirateShip.get(i) < minHealth)
                    {
                        ++countSections;
                    }
                }
                System.out.printf("%d sections need repair.%n",countSections);
            }
            input = scanner.nextLine();
        }
        if(!hasWinner)
        {
            int pirateShipSum = 0;
            for (int i = 0; i < pirateShip.size(); i++)
            {
                pirateShipSum += pirateShip.get(i);
            }

            int warShipSum = 0;
            for (int i = 0; i < warShip.size(); i++)
            {
                warShipSum += warShip.get(i);
            }
            System.out.printf("Pirate ship status: %d%n",pirateShipSum);
            System.out.printf("Warship status: %d",warShipSum);
        }
    }
}
