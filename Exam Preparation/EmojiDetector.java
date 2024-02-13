package ExamPreparation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        BigDecimal coolThreshold = new BigDecimal(1);

        for(char ch : text.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                coolThreshold = coolThreshold.multiply(BigDecimal.valueOf(Character.getNumericValue(ch)));
            }
        }

        System.out.println("Cool threshold: " + coolThreshold);

        String regex = "((?:\\:\\:|\\*\\*))[A-Z][a-z]{2,}\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> emojis = new ArrayList<>();
        int countEmojis = 0;

        while(matcher.find())
        {
            int sum = 0;
            String word = matcher.group();
            ++countEmojis;
            String newWord = word.substring(2,word.length() - 2);
            for (char ch : newWord.toCharArray())
            {
                sum += ch;
            }

            BigDecimal sumBigDecimal = BigDecimal.valueOf(sum);

            if(sumBigDecimal.compareTo(coolThreshold) > 0)
            {
                emojis.add(word);
            }
        }

        System.out.printf("%d emojis found in the text. The cool ones are: \n", countEmojis);
        for (String emoji : emojis)
        {
            System.out.println(emoji);
        }

    }
}
