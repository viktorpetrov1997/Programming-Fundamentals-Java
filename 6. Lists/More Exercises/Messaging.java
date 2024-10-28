package Lists.MoreExercises;

import com.sun.source.tree.LabeledStatementTree;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        List<String> string = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        String text = "";

        for(int i = 0; i < numbers.size(); i++)
        {
            int number = numbers.get(i);
            int index = 0;
            while(number > 0)
            {
                int digit = number % 10;
                index += digit;
                number /= 10;
            }

            if(index > string.size() - 1)
            {
                int countIndex = 0;
                for(int j = 0; j < index; j++)
                {
                    ++countIndex;
                    if(countIndex == string.size())
                    {
                        countIndex = 0;
                    }
                }
                index = countIndex;
            }
            text += string.get(index);
            string.remove(index);
        }
        System.out.println(text);
    }
}
