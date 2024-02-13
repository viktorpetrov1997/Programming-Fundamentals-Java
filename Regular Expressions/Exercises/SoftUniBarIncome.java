package RegularExpressions.Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<customerName>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$";

        Pattern pattern = Pattern.compile(regex);

        double totalIncome = 0;

        String input = scanner.nextLine();
        while(!input.equals("end of shift"))
        {
            Matcher matcher = pattern.matcher(input);

            if(matcher.find())
            {
                int quantity = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                totalIncome += quantity * price;
                System.out.printf("%s: %s - %.2f%n",matcher.group("customerName"),matcher.group("product"),
                quantity * price);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalIncome);
    }
}
