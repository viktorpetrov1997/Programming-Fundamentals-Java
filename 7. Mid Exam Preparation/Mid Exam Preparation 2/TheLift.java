package MidExamPreparation.MidExamPreparationTwo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        int currentCapacity = 0;
        for(int i = 0; i < wagons.size(); i++)
        {
            currentCapacity += wagons.get(i);
        }

        int maxCapacity = wagons.size() * 4;

        for(int i = 0; i < wagons.size(); i++)
        {
            if(wagons.get(i) < 4 && people > 0)
            {
                while(wagons.get(i) < 4 && people > 0)
                {
                    wagons.set(i,wagons.get(i) + 1);
                    ++currentCapacity;
                    --people;
                }
            }

            if(currentCapacity >= maxCapacity || people <= 0)
            {
                break;
            }
        }

        if(people <= 0 && currentCapacity < maxCapacity)
        {
            System.out.println("The lift has empty spots!");
        }

        if(people > 0 && currentCapacity >= maxCapacity)
        {
            System.out.printf("There isn't enough space! %d people in a queue!%n",people);
        }

        for(int wagon : wagons)
        {
            System.out.print(wagon + " ");
        }
    }
}
