package MapsLambdaAndStreamAPI.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Double> productsPrice = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> productsQuantity = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while(!input.equals("buy"))
        {
            String[] productInfo = input.split(" ");
            String product = productInfo[0];
            double price = Double.parseDouble(productInfo[1]);
            int quantity = Integer.parseInt(productInfo[2]);

            productsPrice.put(product, price);

            if(!productsQuantity.containsKey(product))
            {
                productsQuantity.put(product,quantity);
            }
            else
            {
                productsQuantity.put(product,productsQuantity.get(product) + quantity);
            }


            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productsPrice.entrySet())
        {
            String product = entry.getKey();
            double price = entry.getValue();
            double totalPrice = price * productsQuantity.get(product);
            System.out.printf("%s -> %.2f%n", product, totalPrice);
        }
    }
}
