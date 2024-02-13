package ObjectsAndClasses;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student
{
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    public Student(String firstName, String lastName, int age, String city)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getCity()
    {
        return city;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();
        while(!input.equals("end"))
        {
            String[] studentInfo = input.split(" ");

            Student student = new Student(studentInfo[0],studentInfo[1],Integer.parseInt(studentInfo[2]),studentInfo[3]);

            students.add(student);

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for(Student student : students)
        {
            if(student.getCity().equals(city))
            {
                System.out.println(student.getFirstName() + " " + student.getLastName() + " is " + student.getAge()
                + " years old");
            }
        }
    }
}
