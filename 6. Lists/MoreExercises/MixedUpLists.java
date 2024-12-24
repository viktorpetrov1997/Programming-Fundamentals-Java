package Lists.MoreExercises;

import java.lang.reflect.GenericDeclaration;
import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        int smallerList = 0;

        if(firstNumbers.size() > secondNumbers.size())
        {
            smallerList = secondNumbers.size();
        }
        else
        {
            smallerList = firstNumbers.size();
        }

        Collections.reverse(secondNumbers);

        List<Integer> mixedUpList = new ArrayList<>();

        for(int i = 0; i < smallerList; i++)
        {
            mixedUpList.add(firstNumbers.get(i));
            mixedUpList.add(secondNumbers.get(i));
        }

        int start = 0;
        int end = 0;
        if(firstNumbers.size() > secondNumbers.size())
        {
            start = Math.min(firstNumbers.get(firstNumbers.size() - 2),firstNumbers.get(firstNumbers.size() - 1));
            end = Math.max(firstNumbers.get(firstNumbers.size() - 2),firstNumbers.get(firstNumbers.size() - 1));
        }
        else
        {
            start = Math.min(secondNumbers.get(secondNumbers.size() - 2),secondNumbers.get(secondNumbers.size() - 1));
            end = Math.max(secondNumbers.get(secondNumbers.size() - 2),secondNumbers.get(secondNumbers.size() - 1));
        }

        List<Integer> numbersInRange = new ArrayList<>();
        for(int i = 0; i < mixedUpList.size(); i++)
        {
            if(mixedUpList.get(i) > start && mixedUpList.get(i) < end)
            {
                numbersInRange.add(mixedUpList.get(i));
            }
        }

        Collections.sort(numbersInRange);

        for(int i = 0; i < numbersInRange.size(); i++)
        {
            System.out.print(numbersInRange.get(i) + " ");
        }
    }
}
