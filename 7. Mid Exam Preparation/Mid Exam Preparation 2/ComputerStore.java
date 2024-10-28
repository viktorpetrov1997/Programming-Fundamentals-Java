package MidExamPreparation.MidExamPreparationTwo;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class ComputerStore
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double priceWithoutTaxes = 0;
        double taxes = 0;

        String input = scanner.nextLine();
        while(!input.equals("special") && !input.equals("regular"))
        {
            double partsPrice = Double.parseDouble(input);
            if(partsPrice < 0)
            {
                System.out.println("Invalid price!");
            }
            else
            {
                priceWithoutTaxes += partsPrice;
                taxes += partsPrice * 0.2;
            }
            input = scanner.nextLine();
        }

        double totalPrice = priceWithoutTaxes + taxes;

        if(input.equals("special"))
        {
            totalPrice *= 0.9;
        }

        if(totalPrice > 0)
        {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n",taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$",totalPrice);
        }
        else
        {
            System.out.println("Invalid order!");
        }
    }
}
