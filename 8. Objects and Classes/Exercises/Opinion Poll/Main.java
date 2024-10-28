package ObjectsAndClasses.Exercises.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        List<Person> listOfPeople = new ArrayList<>();
        for (int i = 0; i < N; i++)
        {
            String[] personalInfo = scanner.nextLine().split(" ");
            String name = personalInfo[0];
            int age = Integer.parseInt(personalInfo[1]);

            if(age > 30)
            {
                Person person = new Person(name, age);
                listOfPeople.add(person);
            }
        }

        for(Person person : listOfPeople)
        {
            System.out.println(person);
        }
    }
}
