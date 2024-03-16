package ExamPreparation.ExamPreparationTwo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String regex = "([#|])(?<name>[A-Za-z ]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d+)\\1";

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        StringBuilder itemsInfo = new StringBuilder();
        int totalCalories = 0;
        while(matcher.find())
        {
            String name = matcher.group("name");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            totalCalories += calories;
            itemsInfo.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n",name,date,calories));
        }

        System.out.printf("You have food to last you for: %d days!%n",totalCalories / 2000);
        System.out.println(itemsInfo);
    }
}
