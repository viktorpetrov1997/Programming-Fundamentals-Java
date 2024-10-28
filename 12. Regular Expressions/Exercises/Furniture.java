package RegularExpressions.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<furnitureName>\\w+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)";

        Pattern pattern = Pattern.compile(regex);

        List<String> furniture = new ArrayList<>();
        double totalMoneySpend = 0;

        String input = scanner.nextLine();
        while(!input.equals("Purchase"))
        {
            Matcher matcher = pattern.matcher(input);
            if(matcher.find())
            {
                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furniture.add(furnitureName);
                totalMoneySpend += price * quantity;
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalMoneySpend);
    }
}
