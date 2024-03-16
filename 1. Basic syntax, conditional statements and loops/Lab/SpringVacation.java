package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class SpringVacation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int daysOfTheTrip = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        double priceOfFuelPerKm = Double.parseDouble(scanner.nextLine());
        double foodExpensesPerPersonPerDay = Double.parseDouble(scanner.nextLine());
        double priceOfRoomPerNightPerPerson = Double.parseDouble(scanner.nextLine());

        double currentExpenses = 0.0;

        boolean isExceeded = false;

        if(numberOfPeople > 10)
        {
            priceOfRoomPerNightPerPerson *= 0.75;
        }

        double totalFoodAndAccommodation = (daysOfTheTrip * foodExpensesPerPersonPerDay * numberOfPeople)
                + (daysOfTheTrip * priceOfRoomPerNightPerPerson * numberOfPeople);

        currentExpenses = totalFoodAndAccommodation;

        for(int i=1; i<=daysOfTheTrip; i++)
        {
            double traveledDistance = Double.parseDouble(scanner.nextLine());
            currentExpenses += (traveledDistance * priceOfFuelPerKm);
            if(i == 3 || i == 5 || i == 6)
            {
                currentExpenses += currentExpenses * 0.4;
            }
            if(i == 7)
            {
                currentExpenses -= currentExpenses / numberOfPeople;
            }
            if(currentExpenses > budget)
            {
                isExceeded = true;
                break;
            }
        }

        if(isExceeded)
        {
            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.",currentExpenses - budget);
        }
        else
        {
            System.out.printf("You have reached the destination. You have %.2f$ budget left.",budget - currentExpenses);
        }
    }
}
