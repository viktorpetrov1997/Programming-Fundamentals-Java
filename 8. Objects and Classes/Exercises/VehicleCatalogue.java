package ObjectsAndClasses.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue
{
    private String typeOfVehicle;
    private String model;
    private String color;
    private int horsePower;
    public VehicleCatalogue(String typeOfVehicle, String model, String color, int horsePower)
    {
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    @Override
    public String toString()
    {
        String type = typeOfVehicle.equals("car") ? "Car" : "Truck";
        return "Type: " + type + "\n" +
                "Model: " +  model + "\n" +
                "Color: " + color + "\n" +
                "Horsepower: " + horsePower;
    }
    public String getTypeOfVehicle()
    {
        return typeOfVehicle;
    }
    public String getModel()
    {
        return model;
    }
    public int getHorsePower()
    {
        return horsePower;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<VehicleCatalogue> vehicleCatalogueList = new ArrayList<>();

        String input = scanner.nextLine();
        while(!input.equals("End"))
        {
            String[] vehicles = input.split(" ");
            String typeOfVehicle = vehicles[0];
            String model = vehicles[1];
            String color = vehicles[2];
            int horsePower = Integer.parseInt(vehicles[3]);

            VehicleCatalogue vehicleCatalogue = new VehicleCatalogue(typeOfVehicle,model,color,horsePower);
            vehicleCatalogueList.add(vehicleCatalogue);

            input = scanner.nextLine();
        }

        String model = scanner.nextLine();
        while(!model.equals("Close the Catalogue"))
        {
            for(VehicleCatalogue vehicle: vehicleCatalogueList)
            {
                if(vehicle.getModel().equals(model))
                {
                    System.out.println(vehicle);
                }
            }
            model = scanner.nextLine();
        }

        int numberOfCars = 0;
        int numberOfTrucks = 0;
        double carsHorsePower = 0;
        double trucksHorsePower = 0;

        for(VehicleCatalogue vehicle: vehicleCatalogueList)
        {
            if(vehicle.getTypeOfVehicle().equals("car"))
            {
                carsHorsePower += vehicle.getHorsePower();
                ++numberOfCars;
            }
            else if(vehicle.getTypeOfVehicle().equals("truck"))
            {
                trucksHorsePower += vehicle.getHorsePower();
                ++numberOfTrucks;
            }
        }

        double averageCars = carsHorsePower /  numberOfCars;
        if(numberOfCars == 0) averageCars = 0;
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCars);

        double averageTrucks = trucksHorsePower / numberOfTrucks;
        if(numberOfTrucks == 0) averageTrucks = 0;
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTrucks);
    }
}
