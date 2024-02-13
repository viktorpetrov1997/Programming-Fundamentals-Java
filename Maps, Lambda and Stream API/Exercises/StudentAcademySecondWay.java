package MapsLambdaAndStreamAPI.Exercises;

import java.util.*;

public class StudentAcademySecondWay
{
    private static double getAverageGrade(List<Double> grades)
    {
        double sumGrades = 0;

        for (double grade : grades)
        {
            sumGrades += grade;
        }
        return sumGrades / grades.size();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 0; i < countStudents; i++)
        {
            String studentName = scanner.nextLine();

            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentGrades.containsKey(studentName))
            {
                studentGrades.put(studentName, new ArrayList<>());
            }
            studentGrades.get(studentName).add(grade);
        }

        LinkedHashMap<String, Double> studentAverageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet())
        {
            String studentName = entry.getKey();

            List<Double> grades = entry.getValue();

            double averageGrade = getAverageGrade (grades);

            if(averageGrade >= 4.50)
            {
                studentAverageGrade.put(studentName, averageGrade);
            }
        }

        studentAverageGrade.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value));
    }
}
