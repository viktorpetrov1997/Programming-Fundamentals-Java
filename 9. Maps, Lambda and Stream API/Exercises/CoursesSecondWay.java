package MapsLambdaAndStreamAPI.Exercises;

import java.util.*;

public class CoursesSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> coursesWithStudents = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while(!input.equals("end"))
        {
            String[] courseInfo = input.split(" : ");
            String course = courseInfo[0];
            String student = courseInfo[1];
            coursesWithStudents.putIfAbsent(course,new ArrayList<>());
            coursesWithStudents.get(course).add(student);

            input = scanner.nextLine();
        }

        for(Map.Entry<String, List<String>> course : coursesWithStudents.entrySet())
        {
            System.out.println(course.getKey() + ": " + course.getValue().size());
            for(String student : course.getValue())
            {
                System.out.println("-- " + student);
            }
        }
    }
}
