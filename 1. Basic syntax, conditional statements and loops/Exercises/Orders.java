package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class Orders
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        double total = 0;

        for(int i=0;i<N;i++)
        {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            total += (days * capsulesCount) * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f\n",(days * capsulesCount) * pricePerCapsule);
        }

        System.out.printf("Total: $%.2f",total);
    }
}
