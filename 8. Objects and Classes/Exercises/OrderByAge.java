package ObjectsAndClasses.Exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge
{
    String name;
    String id;
    int age;
    public OrderByAge(String name, String id, int age)
    {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return name + " with ID: " + id + " is " + age + " years old.";
    }

    public int getAge()
    {
        return age;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<OrderByAge> people = new ArrayList<>();

        String input = scanner.nextLine();
        while(!input.equals("End"))
        {
            String[] personInfo = input.split(" ");
            String name = personInfo[0];
            String id = personInfo[1];
            int age = Integer.parseInt(personInfo[2]);

            people.add(new OrderByAge(name,id,age));

            input = scanner.nextLine();
        }

        people.sort(Comparator.comparing(OrderByAge::getAge));

        for(OrderByAge person : people)
        {
            System.out.println(person);
        }
    }
}
