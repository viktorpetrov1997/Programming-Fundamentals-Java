package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongsSecondWay
{
    private String typeList;
    private String name;
    private String time;

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getTypeList()
    {
        return typeList;
    }

    public void setTypeList(String typeList)
    {
        this.typeList = typeList;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        List<SongsSecondWay> songs = new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++)
        {
            String[] songsArray = scanner.nextLine().split("_");

            SongsSecondWay song = new SongsSecondWay();

            song.setTypeList(songsArray[0]);
            song.setName(songsArray[1]);
            song.setTime(songsArray[2]);

            songs.add(song);
        }
        String type = scanner.nextLine();
        if(type.equals("all"))
        {
            for(SongsSecondWay song : songs)
            {
                System.out.println(song.getName());
            }
        }
        else
        {
            for(SongsSecondWay song : songs)
            {
                if(song.getTypeList().equals(type))
                {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
