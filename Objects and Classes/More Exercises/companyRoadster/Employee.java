package ObjectsAndClasses.MoreExercises.companyRoadster;

public class Employee
{
    String name;
    double salary;

    String position;
    String department;
    String email;
    int age;

    public Employee(String name, double salary, String position, String department)
    {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = "n/a";
        this.age = -1;
    }

    @Override
    public String toString()
    {
        return String.format("%s %.2f %s %s",name,salary,email,age);
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getDepartment()
    {
        return department;
    }

    public double getSalary()
    {
        return salary;
    }
}
