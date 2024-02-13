package ExamPreparation;

import java.util.Scanner;

public class WorldTour
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();

        String input = scanner.nextLine();
        while(!input.equals("Travel"))
        {
            String[] commandArray = input.split(":");
            String command = commandArray[0];
            if(command.equals("Add Stop"))
            {
                int index = Integer.parseInt(commandArray[1]);
                String string = commandArray[2];
                if(index >= 0 && index <= stops.length())
                {
                    StringBuilder newString = new StringBuilder(stops);
                    newString.insert(index,string);
                    stops = String.valueOf(newString);
                    System.out.println(stops);
                }
                else
                {
                    System.out.println(stops);
                }
            }
            else if(command.equals("Remove Stop"))
            {
                int startIndex = Integer.parseInt(commandArray[1]);
                int endIndex = Integer.parseInt(commandArray[2]);
                if(startIndex >= 0 && endIndex < stops.length())
                {
                    StringBuilder newString = new StringBuilder(stops);
                    newString.delete(startIndex,endIndex + 1);
                    stops = String.valueOf(newString);
                    System.out.println(stops);
                }
                else
                {
                    System.out.println(stops);
                }
            }
            else if(command.equals("Switch"))
            {
                String oldString = commandArray[1];
                String newString = commandArray[2];
                if(stops.contains(oldString))
                {
                    stops = stops.replace(oldString,newString);
                    System.out.println(stops);
                }
                else
                {
                    System.out.println(stops);
                }
            }
            input = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + stops);
    }
}
