package MapsLambdaAndStreamAPI.Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarmingSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, Integer> materials = new LinkedHashMap<>();

        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        LinkedHashMap<String, Integer> junks = new LinkedHashMap<>();
        boolean isOver = false;

        while(!isOver)
        {
            String input = scanner.nextLine();
            String[] inputData = input.split(" ");
            for (int index = 0; index < inputData.length; index += 2)
            {
                int quantity = Integer.parseInt(inputData[index]);
                String material = inputData[index + 1].toLowerCase();
                if(material.equals("shards") || material.equals("fragments") || material.equals("motes"))
                {
                    int currentQuantity = materials.get(material);
                    materials.put(material, currentQuantity + quantity);
                    if(materials.get(material) >= 250)
                    {
                        if(material.equals("shards"))
                        {
                            System.out.println("Shadowmourne obtained!");
                        }
                        else if(material.equals("fragments"))
                        {
                            System.out.println("Valanyr obtained!");
                        }
                        else
                        {
                            System.out.println("Dragonwrath obtained!");
                        }
                        materials.put(material, materials.get(material) - 250);
                        isOver = true;
                        break;
                    }
                }
                else
                {
                    if (!junks.containsKey(material))
                    {
                        junks.put(material, quantity);
                    }
                    else
                    {
                        int currentQuantity = junks.get(material);
                        junks.put(material, currentQuantity + quantity);
                    }
                }
            }
        }

        System.out.println("shards: " + (materials.get("shards")));
        System.out.println("fragments: " + (materials.get("fragments")));
        System.out.println("motes: " + (materials.get("motes")));

        junks.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }
}
