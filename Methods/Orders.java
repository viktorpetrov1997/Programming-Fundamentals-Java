package methods;

import java.util.Scanner;

public class Orders
{
    private static void priceOfOrder(String product, int quantity)
    {
        double price = 0;
        if(product.equals("coffee"))
        {
            price = 1.50;
        }
        else if(product.equals("water"))
        {
            price = 1.00;
        }
        else if(product.equals("coke"))
        {
            price = 1.40;
        }
        else if(product.equals("snacks"))
        {
            price = 2.00;
        }
        System.out.printf("%.2f",price * quantity);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        priceOfOrder(product,quantity);
    }
}
