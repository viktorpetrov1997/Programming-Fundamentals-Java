package Lists.MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int middleIndex = numbers.size() / 2;
        double firstRacerTime = 0;

        for (int i = 0; i < middleIndex; i++)
        {
            firstRacerTime += numbers.get(i);
            if(numbers.get(i) == 0)
            {
                firstRacerTime *= 0.8;
            }
        }

        double secondRacerTime = 0;
        for(int i = numbers.size() - 1; i >= middleIndex + 1; i--)
        {
            secondRacerTime += numbers.get(i);
            if(numbers.get(i) == 0)
            {
                secondRacerTime *= 0.8;
            }
        }

        if(firstRacerTime < secondRacerTime)
        {
            System.out.printf("The winner is left with total time: %.1f",firstRacerTime);
        }
        else if(secondRacerTime < firstRacerTime)
        {
            System.out.printf("The winner is right with total time: %.1f",secondRacerTime);
        }
    }
}
