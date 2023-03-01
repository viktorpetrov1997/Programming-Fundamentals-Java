package basic.syntax;

import java.util.Scanner;

public class WillBeBackIn30Minutes
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine()) + 30;

        if(minutes > 59)
        {
            hours += 1;
            minutes -= 60;
        }

        if(hours > 23)
        {
            hours = 0;
        }

        if(minutes < 10)
        {
            System.out.printf("%d:%02d%n", hours, minutes);
        }
        else
        {
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}
