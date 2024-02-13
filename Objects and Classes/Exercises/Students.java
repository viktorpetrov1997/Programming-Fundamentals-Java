package ObjectsAndClasses.Exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students
{
    private String firstName;
    private String lastName;
    private double grade;

    public Students(String firstName, String lastName, double grade)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    @Override
    public String toString()
    {
        return String.format("%s %s: %.2f",this.firstName,this.lastName,this.grade);
    }

    public double getGrade()
    {
        return grade;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Students> studentsList = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            String[] studentInfo = scanner.nextLine().split(" ");
            String firstName = studentInfo[0];
            String lastName = studentInfo[1];
            double grade = Double.parseDouble(studentInfo[2]);

            Students student = new Students(firstName,lastName,grade);
            studentsList.add(student);
        }

        studentsList.sort(Comparator.comparing(Students::getGrade).reversed());

        for(Students student : studentsList)
        {
            System.out.println(student);
        }
    }
}
