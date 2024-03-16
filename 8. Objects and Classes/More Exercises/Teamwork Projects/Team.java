package ObjectsAndClasses.MoreExercises.TeamworkProjects;

import java.util.ArrayList;
import java.util.List;

public class Team
{
    String user;
    String teamName;

    List<String> members = new ArrayList<>();

    public Team(String user, String teamName)
    {
        this.user = user;
        this.teamName = teamName;
    }

    public int getMembersSize()
    {
        return members.size();
    }
    public String getUser()
    {
        return user;
    }

    public String getTeamName()
    {
        return teamName;
    }

    public void addMember(String user)
    {
        members.add(user);
    }

    public List<String> getMembers()
    {
        return members;
    }

}
