package MidExamPreparation.MidExamPreparationOne;

import java.util.Scanner;

public class GuineaPig
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double foodQuantityInKg = Double.parseDouble(scanner.nextLine());
        double hayQuantityInKg = Double.parseDouble(scanner.nextLine());
        double coverQuantityInKg = Double.parseDouble(scanner.nextLine());
        double pigWeightInKg = Double.parseDouble(scanner.nextLine());

        double foodQuantityInGrams = foodQuantityInKg * 1000;
        double hayQuantityInGrams = hayQuantityInKg * 1000;
        double coverQuantityInGrams = coverQuantityInKg * 1000;
        double pigWeightInGrams = pigWeightInKg * 1000;

        boolean isNotEnough = false;
        for(int day=1;day<=30;day++)
        {
            foodQuantityInGrams -= 300;
            if(day % 2 == 0)
            {
                double currentHay = foodQuantityInGrams * 0.05;
                hayQuantityInGrams -= currentHay;
            }

            if(day % 3 == 0)
            {
                double currentCover = pigWeightInGrams / 3;
                coverQuantityInGrams -= currentCover;
            }

            if(foodQuantityInGrams <= 0 || hayQuantityInGrams <= 0 || coverQuantityInGrams <= 0)
            {
                isNotEnough = true;
                break;
            }
        }

        if(isNotEnough)
        {
            System.out.println("Merry must go to the pet store!");
        }
        else
        {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                    foodQuantityInGrams / 1000,hayQuantityInGrams / 1000, coverQuantityInGrams / 1000);
        }
    }
}