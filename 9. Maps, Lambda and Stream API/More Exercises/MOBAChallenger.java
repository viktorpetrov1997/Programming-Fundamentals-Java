package MapsLambdaAndStreamAPI.MoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MOBAChallenger
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, Integer>> players = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while(!input.equals("Season end"))
        {
            if(input.contains(" -> "))
            {
                String[] playerInfo = input.split(" -> ");
                String player = playerInfo[0];
                String position = playerInfo[1];
                int skill = Integer.parseInt(playerInfo[2]);
                LinkedHashMap<String, Integer> currentPlayerInfo = new LinkedHashMap<>();
                currentPlayerInfo.put(position, skill);

                if(!players.containsKey(player))
                {
                    players.put(player,currentPlayerInfo);
                }
                else if(!players.get(player).containsKey(position))
                {
                    players.get(player).put(position, skill);
                }
                else if(players.get(player).get(position) < skill)
                {
                    players.get(player).put(position, skill);
                }
            }
            else if(input.contains(" vs "))
            {
                String[] commandArray = input.split(" vs ");
                String player1 = commandArray[0];
                String player2 = commandArray[1];

                if(players.containsKey(player1) && players.containsKey(player2))
                {
                    boolean hasCommon = false;
                    for (String s : players.get(player1).keySet())
                    {
                        for (String s1 : players.get(player2).keySet())
                        {
                            if (s.equals(s1))
                            {
                                hasCommon = true;
                            }
                        }
                    }
                    if (hasCommon)
                    {
                        if (players.get(player1).values().stream().mapToInt(i -> i).sum() >
                                players.get(player2).values().stream().mapToInt(i -> i).sum())
                        {
                            players.remove(player2);
                        }
                        else if (players.get(player1).values().stream().mapToInt(i -> i).sum() <
                                players.get(player2).values().stream().mapToInt(i -> i).sum())
                        {
                            players.remove(player1);
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        LinkedHashMap<String, Integer> totalPoints = new LinkedHashMap<>();

        for(Map.Entry<String, LinkedHashMap<String, Integer>> entry : players.entrySet())
        {
            int totalSkill = entry.getValue().values().stream().mapToInt(Integer::intValue).sum();
            totalPoints.put(entry.getKey(),totalSkill);
        }

        totalPoints.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                .thenComparing(Map.Entry.<String, Integer>comparingByKey()))
                .forEach(playerEntry -> {
                    System.out.println(playerEntry.getKey() + ": " + playerEntry.getValue() + " skill");
                    players.get(playerEntry.getKey()).entrySet().stream()
                            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                                    .thenComparing(Map.Entry.comparingByKey()))
                            .forEach(entry -> {
                                System.out.println("- " + entry.getKey() + " <::> " + entry.getValue());
                            });
                });
    }
}
