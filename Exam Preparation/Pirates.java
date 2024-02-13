package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> cityPopulation = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> cityGold = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while(!input.equals("Sail"))
        {
            String[] cityArray = input.split("\\|\\|");
            String city = cityArray[0];
            int population = Integer.parseInt(cityArray[1]);
            int gold = Integer.parseInt(cityArray[2]);

            if(!cityPopulation.containsKey(city))
            {
                cityPopulation.put(city,population);
            }
            else
            {
                cityPopulation.put(city, cityPopulation.get(city) + population);
            }

            if(!cityGold.containsKey(city))
            {
                cityGold.put(city,gold);
            }
            else
            {
                cityGold.put(city, cityGold.get(city) + gold);
            }
            input = scanner.nextLine();
        }

        String text = scanner.nextLine();
        while(!text.equals("End"))
        {
            String[] commandArray = text.split("=>");
            String command = commandArray[0];
            if(command.equals("Plunder"))
            {
                String city = commandArray[1];
                int people = Integer.parseInt(commandArray[2]);
                int gold = Integer.parseInt(commandArray[3]);

                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", city, gold, people);

                cityPopulation.put(city, cityPopulation.get(city) - people);
                cityGold.put(city, cityGold.get(city) - gold);

                if(cityPopulation.get(city) <= 0 || cityGold.get(city) <= 0)
                {
                    System.out.printf("%s has been wiped off the map!\n", city);
                    cityPopulation.remove(city);
                    cityGold.remove(city);
                }
            }
            else if(command.equals("Prosper"))
            {
                String city = commandArray[1];
                int gold = Integer.parseInt(commandArray[2]);

                if(gold > 0)
                {
                    int addedGold = cityGold.get(city) + gold;
                    cityGold.put(city, addedGold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", gold, city, addedGold);
                }
                else
                {
                    System.out.println("Gold added cannot be a negative number!");
                }
            }
            text = scanner.nextLine();
        }

        if(cityPopulation.isEmpty())
        {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
        else
        {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", cityPopulation.size());
            for(Map.Entry<String, Integer> entry : cityPopulation.entrySet())
            {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n",entry.getKey(),entry.getValue(),cityGold.get(entry.getKey()));
            }
        }
    }
}
