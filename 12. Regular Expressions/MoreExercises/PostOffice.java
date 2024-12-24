package RegularExpressions.MoreExercises;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\|");
        String firstPart = text[0];
        String secondPart = text[1];
        String thirdPart = text[2];

        String firstPartRegex = "([#$%*&])([A-Z]+)\\1";

        Pattern firstPartPattern = Pattern.compile(firstPartRegex);
        Matcher firstPartMatcher = firstPartPattern.matcher(firstPart);

        String capitalLetters = "";

        if(firstPartMatcher.find())
        {
            String current = firstPartMatcher.group();
            capitalLetters = current.substring(1, current.length() - 1);
        }

        LinkedHashMap<Character, Integer> lettersLength = new LinkedHashMap<>();

        for(int i = 0; i < capitalLetters.length(); i++)
        {
            String secondPartRegex = "([0-9]{2}):([0-9]{2})";
            Pattern secondPartPattern = Pattern.compile(secondPartRegex);
            Matcher secondPartMatcher = secondPartPattern.matcher(secondPart);

            char symbol = capitalLetters.charAt(i);

            while(secondPartMatcher.find())
            {
                String[] digits = secondPartMatcher.group().split(":");
                int asciiCode = Integer.parseInt(digits[0]);
                int length = Integer.parseInt(digits[1]);

                if(symbol == asciiCode && !lettersLength.containsKey(symbol))
                {
                    lettersLength.put(symbol, length + 1);
                }
            }
        }

        String[] thirdPartWords = thirdPart.split(" ");

        for(int i = 0; i < capitalLetters.length(); i++)
        {
            char firstLetter = capitalLetters.charAt(i);
            int length = lettersLength.get(firstLetter);

            for(String word : thirdPartWords)
            {
                int wordLength = word.length();
                char wordFirstChar = word.charAt(0);

                if(length == wordLength && firstLetter == wordFirstChar)
                {
                    System.out.println(word);
                }
            }
        }
    }
}
