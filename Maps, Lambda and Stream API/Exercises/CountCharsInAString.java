package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharsInAString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        LinkedHashMap<Character, Integer> charsCount = new LinkedHashMap<>();

        for(char ch : text.toCharArray())
        {
            if(ch == ' ') continue;

            charsCount.putIfAbsent(ch,0);
            charsCount.put(ch, charsCount.get(ch) + 1);
        }

        charsCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        //charsCount.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
