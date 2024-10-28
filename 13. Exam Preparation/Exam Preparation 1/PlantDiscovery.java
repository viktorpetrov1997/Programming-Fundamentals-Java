package ExamPreparation.ExamPreparationOne;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String,Integer> plantRarity = new LinkedHashMap<>();
        LinkedHashMap<String,Double> plantRating = new LinkedHashMap<>();

        for(int i = 0; i < n; i++)
        {
            String[] text = scanner.nextLine().split("<->");
            String plant = text[0];
            int rarity =Integer.parseInt(text[1]);

            plantRarity.put(plant,rarity);
            plantRating.putIfAbsent(plant,0.0);
        }

        String input = scanner.nextLine();

        while(!input.equals("Exhibition"))
        {

            String [] commandArr = input.split("[: -]+");
            String command = commandArr[0];
            String plant = commandArr[1];

            if(!plantRating.containsKey(plant))
            {
                System.out.println("error");
            }
            else
            {
                switch(command)
                {
                    case "Rate":
                    {
                        double rating = Integer.parseInt(commandArr[2]);
                        if(plantRarity.containsKey(plant))
                        {
                            if(plantRating.get(plant)==0)
                            {
                                plantRating.put(plant, rating);
                            }
                            else
                            {
                                plantRating.put(plant, (rating + plantRating.get(plant)) / 2);
                            }
                        }
                    }
                    break;
                    case "Update":
                    {
                        int rarity = Integer.parseInt(commandArr[2]);
                        plantRarity.put(plant, rarity);
                    }
                    break;
                    case "Reset":
                    {
                        plantRating.put(plant, 0.0);
                        break;
                    }

                    default:
                        System.out.println("error");
                }
            }
            input= scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        for(Map.Entry<String, Integer> entry : plantRarity.entrySet())
        {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",entry.getKey(),entry.getValue(),
                    plantRating.get(entry.getKey()));
        }
    }
}
