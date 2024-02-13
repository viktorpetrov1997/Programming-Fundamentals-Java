package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning
{
    private static boolean doesContainTitle(List<String> courses, String lessonTitle)
    {
        for (int i = 0; i < courses.size(); i++)
        {
            if(courses.get(i).contains(lessonTitle))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<String> courses = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("course start"))
        {
            String[] commandArray = input.split(":");
            String command = commandArray[0];
            if(command.equals("Add"))
            {
                boolean doesExist = doesContainTitle(courses,commandArray[1]);
                if(!doesExist)
                {
                    courses.add(commandArray[1]);
                }
            }
            else if(command.equals("Insert"))
            {
                boolean doesExist = doesContainTitle(courses,commandArray[1]);
                int index = Integer.parseInt(commandArray[2]);
                if(!doesExist)
                {
                    courses.add(index,commandArray[1]);
                }
            }
            else if(command.equals("Remove"))
            {
                boolean doesExist = doesContainTitle(courses,commandArray[1]);
                if(doesExist)
                {
                    courses.remove(commandArray[1]);
                }
            }
            else if(command.equals("Swap"))
            {
                boolean doesExistFirst = doesContainTitle(courses,commandArray[1]);
                boolean doesExistSecond = doesContainTitle(courses,commandArray[2]);
                int indexOfFirstLesson = courses.indexOf(commandArray[1]);
                int indexOfSecondLesson = courses.indexOf(commandArray[2]);
                boolean firstLessonContainsExercise = false;
                boolean secondLessonContainsExercise = false;
                if(doesExistFirst && doesExistSecond)
                {
                    for (int i = 0; i < courses.size(); i++)
                    {
                        if(courses.get(i).equals(commandArray[1] + "-Exercise"))
                        {
                            firstLessonContainsExercise = true;
                            break;
                        }
                    }

                    for (int i = 0; i < courses.size(); i++)
                    {
                        if(courses.get(i).equals(commandArray[2] + "-Exercise"))
                        {
                            secondLessonContainsExercise = true;
                            break;
                        }
                    }
                    
                    if(firstLessonContainsExercise)
                    {
                        courses.remove(indexOfFirstLesson + 1);
                        courses.set(indexOfSecondLesson,commandArray[1]);
                        courses.add(indexOfSecondLesson+1,commandArray[1] + "-Exercise");
                    }
                    else
                    {
                        courses.set(indexOfSecondLesson,commandArray[1]);
                    }
                    
                    if(secondLessonContainsExercise)
                    {
                        courses.remove(indexOfSecondLesson + 1);
                        courses.set(indexOfFirstLesson,commandArray[2]);
                        courses.add(indexOfFirstLesson+1,commandArray[2] + "-Exercise");
                    }
                    else
                    {
                        courses.set(indexOfFirstLesson,commandArray[2]);
                    }
                }
            }
            else if(command.equals("Exercise"))
            {
                boolean doesExist = doesContainTitle(courses,commandArray[1]);
                boolean containsExercise = false;
                for (int i = 0; i < courses.size(); i++)
                {
                    if(courses.get(i).equals(commandArray[1] + "-Exercise"))
                    {
                        containsExercise = true;
                        break;
                    }
                }
                if(doesExist && !containsExercise)
                {
                    int indexOfLesson = courses.indexOf(commandArray[1]);
                    courses.add(indexOfLesson + 1,commandArray[1] + "-Exercise");
                }
                else if(!doesExist)
                {
                    courses.add(commandArray[1]);
                    courses.add(commandArray[1] + "-Exercise");
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < courses.size(); i++)
        {
            System.out.printf("%d.%s%n",i+1,courses.get(i));
        }
    }
}
