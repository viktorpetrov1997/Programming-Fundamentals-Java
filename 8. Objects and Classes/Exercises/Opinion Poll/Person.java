package ObjectsAndClasses.Exercises.OpinionPoll;

public class Person
{
    String name;
    int age;

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return this.getName() + " - " + this.getAge();
    }
}
