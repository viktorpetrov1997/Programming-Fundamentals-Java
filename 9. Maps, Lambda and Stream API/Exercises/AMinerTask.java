package MapsLambdaAndStreamAPI.Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class AMinerTask
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> resourcesMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while(!input.equals("stop"))
        {
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());
            if(!resourcesMap.containsKey(resource))
            {
                resourcesMap.put(resource,quantity);
            }
            else
            {
                resourcesMap.put(resource, resourcesMap.get(resource) + quantity);
            }
            input = scanner.nextLine();
        }
        resourcesMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}

