package RegularExpressions.MoreExercises;

import java.util.*;
import java.util.regex.*;

public class RageQuit
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Matcher matcher = Pattern.compile("(?<string>\\D*)(?<count>\\d+)").matcher(input);

        StringBuilder newString = new StringBuilder();
        while(matcher.find())
        {
            String str = matcher.group("string").toUpperCase();
            int count = Integer.parseInt(matcher.group("count"));

            for(int i=0; i < count; i++)
            {
                newString.append(str);
            }
        }

        System.out.printf("Unique symbols used: %d%n", newString.chars().distinct().count());
        System.out.println(newString);
    }
}
