package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentSecondVersion
{
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    public StudentSecondVersion(String firstName, String lastName, int age, String city)
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

    @Override
    public String toString()
    {
        return String.format("%s %s is %s years old",
            this.getFirstName(),
            this.getLastName(),
            this.getAge());
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    private static int findStudentIndex(List<StudentSecondVersion> students, String firstName, String lastName)
    {
        for (int i = 0; i < students.size(); i++)
        {
            String firstNameList = students.get(i).getFirstName();
            String lastNameList = students.get(i).getLastName();

            if(firstNameList.equals(firstName) && lastNameList.equals(lastName))
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<StudentSecondVersion> students = new ArrayList<>();

        String input = scanner.nextLine();
        while(!input.equals("end"))
        {
            String[] studentInfo = input.split(" ");

            StudentSecondVersion student = new StudentSecondVersion(studentInfo[0],studentInfo[1],Integer.parseInt(studentInfo[2]),studentInfo[3]);

            int existingIndex = findStudentIndex(students,student.getFirstName(),student.getLastName());
            if(existingIndex != -1)
            {
                students.get(existingIndex).setAge(Integer.parseInt(studentInfo[2]));
                students.get(existingIndex).setCity(studentInfo[3]);
            }
            else
            {
                students.add(student);
            }

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for(StudentSecondVersion student : students)
        {
            if(student.getCity().equals(city))
            {
                //System.out.println(student.getFirstName() + " " + student.getLastName() + " is " + student.getAge()
                        //+ " years old");
                System.out.println(student);
            }
        }
    }
}
