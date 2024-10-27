package BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class GamingStore
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        double totalSpent = 0;

        String input = scanner.nextLine();

        while(!input.equals("Game Time"))
        {
            if(input.equals("OutFall 4"))
            {
                if(currentBalance < 39.99)
                {
                    System.out.println("Too Expensive");
                }
                else
                {
                    currentBalance -= 39.99;
                    totalSpent += 39.99;
                    System.out.println("Bought OutFall 4");
                }
            }
            else if(input.equals("CS: OG"))
            {
                if(currentBalance < 15.99)
                {
                    System.out.println("Too Expensive");
                }
                else
                {
                    currentBalance -= 15.99;
                    totalSpent += 15.99;
                    System.out.println("Bought CS: OG");
                }
            }
            else if(input.equals("Zplinter Zell"))
            {
                if(currentBalance < 19.99)
                {
                    System.out.println("Too Expensive");
                }
                else
                {
                    currentBalance -= 19.99;
                    totalSpent += 19.99;
                    System.out.println("Bought Zplinter Zell");
                }
            }
            else if(input.equals("Honored 2"))
            {
                if(currentBalance < 59.99)
                {
                    System.out.println("Too Expensive");
                }
                else
                {
                    currentBalance -= 59.99;
                    totalSpent += 59.99;
                    System.out.println("Bought Honored 2");
                }
            }
            else if(input.equals("RoverWatch"))
            {
                if(currentBalance < 29.99)
                {
                    System.out.println("Too Expensive");
                }
                else
                {
                    currentBalance -= 29.99;
                    totalSpent += 29.99;
                    System.out.println("Bought RoverWatch");
                }
            }
            else if(input.equals("RoverWatch Origins Edition"))
            {
                if(currentBalance < 39.99)
                {
                    System.out.println("Too Expensive");
                }
                else
                {
                    currentBalance -= 39.99;
                    totalSpent += 39.99;
                    System.out.println("Bought RoverWatch Origins Edition");
                }
            }
            else
            {
                System.out.println("Not Found");
            }

            if(currentBalance <= 0)
            {
                System.out.println("Out of money!");
                break;
            }
            input = scanner.nextLine();
        }
        if(currentBalance > 0)
        {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n",totalSpent,currentBalance);
        }
    }
}
