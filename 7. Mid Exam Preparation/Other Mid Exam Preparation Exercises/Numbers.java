package MidExamPreparation.OtherMidExamPreparationExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        double sum = 0;
        for(int i = 0; i < numbersList.size(); i++)
        {
            sum += numbersList.get(i);
        }

        double averageNumber = sum / numbersList.size();

        numbersList.removeIf(n -> n <= averageNumber);
        Collections.sort(numbersList, Collections.reverseOrder());

        if(numbersList.isEmpty())
        {
            System.out.println("No");
        }
        else if(numbersList.size() < 5)
        {
            for(int i = 0; i < numbersList.size(); i++)
            {
                System.out.print(numbersList.get(i) + " ");
            }
        }
        else
        {
            for(int i = 0; i < 5; i++)
            {
                System.out.print(numbersList.get(i) + " ");
            }
        }
    }
}
