package AssociativeArrays.MoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Judge
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, Integer>> judge = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while(!input.equals("no more time"))
        {
            String[] judgeInfo = input.split(" -> ");
            String username = judgeInfo[0];
            String contest = judgeInfo[1];
            int points = Integer.parseInt(judgeInfo[2]);
            LinkedHashMap<String, Integer> currentUserPoints = new LinkedHashMap<>();
            currentUserPoints.put(username,points);

            if(!judge.containsKey(contest))
            {
                judge.put(contest,currentUserPoints);
            }
            else if(!judge.get(contest).containsKey(username))
            {
                judge.get(contest).put(username,points);
            }
            else if(judge.get(contest).get(username) < points)
            {
                judge.get(contest).put(username,points);
            }
            input = scanner.nextLine();
        }

        judge.entrySet().stream()
                .forEach(contest -> {
                    System.out.println(contest.getKey() + ": " + contest.getValue().size() + " participants");
                    AtomicInteger index = new AtomicInteger(1);
                    judge.get(contest.getKey()).entrySet().stream()
                            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                    .forEach(userPoints -> {
                                System.out.println(index.getAndIncrement() + ". " + userPoints.getKey() + " <::> " + userPoints.getValue());
                            });
                });

        System.out.println("Individual standings:");
        LinkedHashMap<String, Integer> individualPoints = new LinkedHashMap<>();
        for (Map.Entry<String, LinkedHashMap<String, Integer>> contest : judge.entrySet())
        {
            for (Map.Entry<String, Integer> userPoints : contest.getValue().entrySet())
            {
                individualPoints.merge(userPoints.getKey(), userPoints.getValue(), Integer::sum);
            }
        }


        /*LinkedHashMap<String, Integer> individualPoints = new LinkedHashMap<>();
        for (Map.Entry<String, LinkedHashMap<String, Integer>> contest : judge.entrySet())
        {
            for (Map.Entry<String, Integer> userPoints : contest.getValue().entrySet())
            {
                individualPoints.putIfAbsent(userPoints.getKey(),0);
                individualPoints.put(userPoints.getKey(),individualPoints.get(userPoints.getKey()) + userPoints.getValue());
            }
        }*/

        AtomicInteger index = new AtomicInteger(1);
        individualPoints.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> {
                    System.out.println(index.getAndIncrement() + ". " + entry.getKey() + " -> " + entry.getValue());
                });
    }
}
