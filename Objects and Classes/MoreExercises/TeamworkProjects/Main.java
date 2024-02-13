package ObjectsAndClasses.MoreExercises.TeamworkProjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main // 83/100
{
    public static boolean teamExists(List<Team> teamList,String teamName)
    {
        for(Team team : teamList)
        {
            if(team.getTeamName().equals(teamName))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean creatorExists(List<Team> teamList,String user)
    {
        for(Team team : teamList)
        {
            if(team.getUser().equals(user))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean memberExists(List<Team> teamList,String user)
    {
        for (int i = 0; i < teamList.size(); i++)
        {
            for (int j = 0; j < teamList.get(i).getMembersSize(); j++)
            {
                if(teamList.get(i).getMembers().get(j).equals(user))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfTeams = Integer.parseInt(scanner.nextLine());

        List<Team> teamList = new ArrayList<>();

        for (int i = 0; i < numberOfTeams; i++)
        {
            String[] input = scanner.nextLine().split("-");

            String user = input[0];
            String teamName = input[1];

            Team team = new Team(user,teamName);

            if(!teamExists(teamList, teamName) && !creatorExists(teamList,user))
            {
                System.out.printf("Team %s has been created by %s!%n",teamName,user);
                teamList.add(team);
            }
            else if(creatorExists(teamList,user))
            {
                System.out.printf("%s cannot create another team!%n",user);
            }
            else
            {
                System.out.printf("Team %s was already created!%n",teamName);
            }
        }

        String input = scanner.nextLine();
        while(!input.equals("end of assignment"))
        {
            String[] commandArray = input.split("->");

            String user = commandArray[0];
            String teamName = commandArray[1];

            if(!teamExists(teamList, teamName))
            {
                System.out.printf("Team %s does not exist!%n",teamName);
            }
            else if(memberExists(teamList,user) || creatorExists(teamList,user))
            {
                System.out.printf("Member %s cannot join team %s!%n",user,teamName);
            }
            else
            {
                for(Team team : teamList)
                {
                    if(team.getTeamName().equals(teamName))
                    {
                        team.addMember(user);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }

        teamList.sort(Comparator.comparing(Team::getTeamName));
        teamList.sort(Comparator.comparing(Team::getMembersSize).reversed());

        for (int i = 0; i < teamList.size(); i++)
        {
            if(!teamList.get(i).getMembers().isEmpty())
            {
                System.out.println(teamList.get(i).getTeamName());
                System.out.println("- " + teamList.get(i).getUser());
                for (int j = 0; j < teamList.get(i).getMembersSize(); j++)
                {
                    System.out.println("-- " + teamList.get(i).getMembers().get(j));
                }
            }
        }

        System.out.println("Teams to disband:");
        for (int i = 0; i < teamList.size(); i++)
        {
            if(teamList.get(i).getMembers().isEmpty())
            {
                System.out.println(teamList.get(i).getTeamName());
            }
        }
    }
}
