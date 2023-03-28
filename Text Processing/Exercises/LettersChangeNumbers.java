package TextProcessing.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LettersChangeNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\s+");

        List<Double> numbers = new ArrayList<>();

        for(String word : text)
        {
            char firstLetter = word.charAt(0);
            char secondLetter = word.charAt(word.length() - 1);
            StringBuilder builder = new StringBuilder(word);
            double number = Double.parseDouble(builder.deleteCharAt(0).deleteCharAt(builder.length() - 1).toString());

            double result = 0;
            if(Character.isUpperCase(firstLetter))
            {
                int positionInTheAlphabet = firstLetter - 'A' + 1;
                result += number / positionInTheAlphabet;
            }
            else if(Character.isLowerCase(firstLetter))
            {
                int positionInTheAlphabet = firstLetter - 'a' + 1;
                result += number * positionInTheAlphabet;
            }

            if(Character.isUpperCase(secondLetter))
            {
                int positionInTheAlphabet = secondLetter - 'A' + 1;
                result -= positionInTheAlphabet;
            }
            else if(Character.isLowerCase(secondLetter))
            {
                int positionInTheAlphabet = secondLetter - 'a' + 1;
                result += positionInTheAlphabet;
            }

            numbers.add(result);
        }

        double sum = numbers.stream().mapToDouble(Double::doubleValue).sum();

        System.out.printf("%.2f",sum);
    }
}
