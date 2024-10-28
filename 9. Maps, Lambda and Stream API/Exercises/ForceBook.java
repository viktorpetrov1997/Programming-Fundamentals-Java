package MapsLambdaAndStreamAPI.Exercises;

import java.util.*;

public class ForceBook
{
    public static boolean memberExists(LinkedHashMap<String, List<String>> force, String forceUser)
    {
        for(Map.Entry<String, List<String>> member : force.entrySet())
        {
            if(member.getValue().contains(forceUser))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> force = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while(!input.equals("Lumpawaroo"))
        {
            if(input.contains("|"))
            {
                String[] commandArray = input.split(" \\| ");
                String forceSide = commandArray[0];
                String forceUser = commandArray[1];
                force.putIfAbsent(forceSide, new ArrayList<>());

                if(!memberExists(force,forceUser))
                {
                    force.get(forceSide).add(forceUser);
                }
            }
            else if(input.contains("->"))
            {
                String[] commandArray = input.split(" -> ");
                String forceSide = commandArray[1];
                String forceUser = commandArray[0];

                force.entrySet().forEach(entry -> entry.getValue().remove(forceUser));

                /*for (Map.Entry<String, List<String>> member : force.entrySet())
                {
                    member.getValue().remove(forceUser);
                }*/

                force.putIfAbsent(forceSide,new ArrayList<>());
                force.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!%n",forceUser,forceSide);
            }
            input = scanner.nextLine();
        }

        for(Map.Entry<String, List<String>> entry : force.entrySet())
        {
            if(!entry.getValue().isEmpty())
            {
                System.out.println("Side: " + entry.getKey() + ", Members: " + entry.getValue().size());
                for(String member : entry.getValue())
                {
                    System.out.println("! " + member);
                }
            }
        }

        /*force.forEach((key, value) ->
        {
            if(!value.isEmpty())
            {
                System.out.println("Side: " + key + ", Members: " + value.size());
                value.forEach(member -> System.out.println("! " + member));
            }
        });*/
    }
}
