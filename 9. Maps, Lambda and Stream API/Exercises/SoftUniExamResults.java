package MapsLambdaAndStreamAPI.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> studentPoints = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> programmingLanguagesCount = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while(!input.equals("exam finished"))
        {
            String[] examInfo = input.split("-");
            String student = examInfo[0];
            if(examInfo.length == 3)
            {
                String language = examInfo[1];
                int points = Integer.parseInt(examInfo[2]);

                studentPoints.putIfAbsent(student,points);
                int currentPoints = studentPoints.get(student);
                if(points > currentPoints)
                {
                    studentPoints.put(student,points);
                }

                programmingLanguagesCount.putIfAbsent(language,0);
                programmingLanguagesCount.put(language, programmingLanguagesCount.get(language) + 1);
            }
            else
            {
                studentPoints.remove(student);
            }
            input = scanner.nextLine();
        }

        System.out.println("Results:");
        studentPoints.forEach((key, value) -> System.out.println(key + " | " + value));

        System.out.println("Submissions:");
        programmingLanguagesCount.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}
