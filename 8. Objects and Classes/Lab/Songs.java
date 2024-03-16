package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Songs
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        List<String> typeList = new ArrayList<>();
        List<String> name = new ArrayList<>();
        List<String> time = new ArrayList<>();
        for (int i = 0; i < numberOfSongs; i++)
        {
            String song = scanner.nextLine();
            String[] songArray = song.split("_");

            typeList.add(songArray[0]);
            name.add(songArray[1]);
            time.add(songArray[2]);
        }
        String type = scanner.nextLine();
        if(type.equals("all"))
        {
            for (int i = 0; i < name.size(); i++)
            {
                System.out.println(name.get(i));
            }
        }
        else
        {
            for (int i = 0; i < name.size(); i++)
            {
                if(typeList.get(i).equals(type))
                {
                    System.out.println(name.get(i));
                }
            }
        }
    }
}
