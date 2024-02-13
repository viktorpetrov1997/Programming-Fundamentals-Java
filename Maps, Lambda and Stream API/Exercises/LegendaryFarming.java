package MapsLambdaAndStreamAPI.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> farm = new LinkedHashMap<>();

        while(true)
        {
            String[] input = scanner.nextLine().split(" ");
            int quantity = 0;
            String material = "";
            boolean legendaryItemFound = false;
            for (int i = 0; i < input.length; i+=2)
            {
                quantity = Integer.parseInt(input[i]);
                material = input[i+1].toLowerCase();
                farm.putIfAbsent(material,0);
                farm.put(material,farm.get(material) + quantity);
                if((material.equals("shards") || material.equals("fragments") || material.equals("motes"))
                        && farm.get(material) >= 250)
                {
                    legendaryItemFound = true;
                    break;
                }
            }
            if(legendaryItemFound) break;
        }

        for (Map.Entry<String, Integer> entry : farm.entrySet())
        {
            if(entry.getKey().equals("shards") && entry.getValue() >= 250)
            {
                farm.put(entry.getKey(), entry.getValue() - 250);
                System.out.println("Shadowmourne obtained!");
            }
            else if(entry.getKey().equals("fragments") && entry.getValue() >= 250)
            {
                farm.put(entry.getKey(), entry.getValue() - 250);
                System.out.println("Valanyr obtained!");
            }
            else if(entry.getKey().equals("motes") && entry.getValue() >= 250)
            {
                farm.put(entry.getKey(), entry.getValue() - 250);
                System.out.println("Dragonwrath obtained!");
            }
        }

        System.out.println("shards: " + (farm.get("shards") == null ? 0 : farm.get("shards")));
        System.out.println("fragments: " + (farm.get("fragments") == null ? 0 : farm.get("fragments")));
        System.out.println("motes: " + (farm.get("motes") == null ? 0 : farm.get("motes")));

        for (Map.Entry<String, Integer> entry : farm.entrySet())
        {
            if(!entry.getKey().equals("shards") && !entry.getKey().equals("fragments") && !entry.getKey().equals("motes"))
            {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
