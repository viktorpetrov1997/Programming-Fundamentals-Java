package MapsLambdaAndStreamAPI.MoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ranking
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> contestPasswords = new LinkedHashMap<>();
        LinkedHashMap<String, LinkedHashMap<String, Integer>> contestInfo = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while(!input.equals("end of contests"))
        {
            String[] commandArray = input.split(":");
            String contest = commandArray[0];
            String password = commandArray[1];
            contestPasswords.put(contest,password);
            input = scanner.nextLine();
        }

        String text = scanner.nextLine();
        while(!text.equals("end of submissions"))
        {
            String[] commandArray = text.split("=>");
            String contest = commandArray[0];
            String password = commandArray[1];
            String username = commandArray[2];
            int points = Integer.parseInt(commandArray[3]);
            LinkedHashMap<String, Integer> currentContestPoints = new LinkedHashMap<>();
            currentContestPoints.put(contest, points);

            if(contestPasswords.containsKey(contest) && contestPasswords.containsValue(password))
            {
                if(!contestInfo.containsKey(username))
                {
                    contestInfo.put(username,currentContestPoints);
                }
                else if(!contestInfo.get(username).containsKey(contest))
                {
                    contestInfo.get(username).put(contest,points);
                }
                else if(contestInfo.get(username).get(contest) < points)
                {
                    contestInfo.get(username).put(contest,points);
                }
            }
            text = scanner.nextLine();
        }

        String userWithMostPoints = "";
        int maxTotalPoints = 0;
        for(Map.Entry<String, LinkedHashMap<String, Integer>> entry : contestInfo.entrySet())
        {
            int totalPoints = entry.getValue().values().stream().mapToInt(Integer::intValue).sum();
            if(maxTotalPoints < totalPoints)
            {
                maxTotalPoints = totalPoints;
                userWithMostPoints = entry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n",userWithMostPoints,maxTotalPoints);
        System.out.println("Ranking:");

        contestInfo.entrySet().stream().sorted(Map.Entry.<String, LinkedHashMap<String, Integer>>comparingByKey())
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    contestInfo.get(entry.getKey()).entrySet().stream()
                            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                            .forEach(entry1 -> {
                                System.out.println("#  " + entry1.getKey() + " -> " + entry1.getValue());
                            });
                });
    }
}
