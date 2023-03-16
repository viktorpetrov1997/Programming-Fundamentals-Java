package lists.more.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TakeSkipRope
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<String> string = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        List<Integer> digits = new ArrayList<>();

        String numbers = "0123456789";
        for (int i = 0; i < string.size(); i++)
        {
            if(numbers.contains(string.get(i)))
            {
                digits.add(Integer.valueOf(string.get(i)));
            }
        }
        for (int i = 0; i < string.size(); i++)
        {
            if(numbers.contains(string.get(i)))
            {
                string.remove(i);
                --i;
            }
        }


        int startIndex = 0;
        String text = "";
        for (int i = 0; i < digits.size(); i++)
        {
            if(i % 2 == 0)
            {
                for (int j = startIndex; j < digits.get(i) + startIndex; j++)
                {
                    if(j >= string.size()) break;
                    text += string.get(j);
                }
                startIndex += digits.get(i);
            }
            else
            {
                startIndex += digits.get(i);
            }
        }
        System.out.println(text);
    }
}
