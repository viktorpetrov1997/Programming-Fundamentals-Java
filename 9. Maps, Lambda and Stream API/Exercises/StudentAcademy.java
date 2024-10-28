package MapsLambdaAndStreamAPI.Exercises;

import java.util.*;

public class StudentAcademy
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<Double>> studentGrades = new LinkedHashMap<String, List<Double>>();

        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < n; i++)
        {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            studentGrades.putIfAbsent(name, new ArrayList<>());
            studentGrades.get(name).add(grade);
        }

        for(Map.Entry<String, List<Double>> entry : studentGrades.entrySet())
        {
            double gradeAverage = entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            if(gradeAverage >= 4.50)
            {
                System.out.printf("%s -> %.2f%n",entry.getKey(),gradeAverage);
            }
        }
    }
}
