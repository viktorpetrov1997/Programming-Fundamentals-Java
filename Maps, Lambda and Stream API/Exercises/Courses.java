package AssociativeArrays.Exercises;

import java.util.*;

public class Courses
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> coursesWithStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> coursesCount = new LinkedHashMap<>(); //We don't need this counter.We can just take the size of the list and determine how many students are in the course.

        String input = scanner.nextLine();
        while(!input.equals("end"))
        {
            String[] courseInfo = input.split(" : ");
            String course = courseInfo[0];
            String student = courseInfo[1];
            coursesWithStudents.putIfAbsent(course,new ArrayList<>());
            coursesWithStudents.get(course).add(student);
            coursesCount.putIfAbsent(course,0);
            coursesCount.put(course,coursesCount.get(course) + 1);
            input = scanner.nextLine();
        }

        for(Map.Entry<String, List<String>> course : coursesWithStudents.entrySet())
        {
            System.out.println(course.getKey() + ": " + coursesCount.get(course.getKey()));
            for(String student : course.getValue())
            {
                System.out.println("-- " + student);
            }
        }
    }
}
