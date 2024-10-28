package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo
{
    private static void changeElements(List<Integer> numbers, int element)
    {
        for(int i = 0; i < numbers.size(); i++)
        {
            if(numbers.get(i) <= element)
            {
                numbers.set(i,numbers.get(i) + element);
            }
            else if(numbers.get(i) > element)
            {
                numbers.set(i,numbers.get(i) - element);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        int sumOfRemovedElements = 0;

        while(numbers.size() > 0)
        {
            int index = Integer.parseInt(scanner.nextLine());

            if(index >= 0 && index < numbers.size())
            {
                int element = numbers.get(index);
                sumOfRemovedElements += element;
                numbers.remove(index);
                changeElements(numbers,element);
            }
            else if(index < 0)
            {
                int removedElement = numbers.get(0);
                sumOfRemovedElements += removedElement;
                numbers.remove(0);
                numbers.add(0,numbers.get(numbers.size() - 1));
                changeElements(numbers,removedElement);
            }
            else if(index > numbers.size() - 1)
            {
                int removedElement = numbers.get(numbers.size() - 1);
                sumOfRemovedElements += removedElement;
                numbers.remove(numbers.size() - 1);
                numbers.add(numbers.size(), numbers.get(0));
                changeElements(numbers, removedElement);
            }
        }
        System.out.println(sumOfRemovedElements);
    }
}
