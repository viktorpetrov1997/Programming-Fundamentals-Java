package ObjectsAndClasses.MoreExercises.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < N; i++)
        {
            String[] carInfo = scanner.nextLine().split(" ");

            String model = carInfo[0];
            int engineSpeed = Integer.parseInt(carInfo[1]);
            int enginePower = Integer.parseInt(carInfo[2]);
            int cargoWeight = Integer.parseInt(carInfo[3]);
            String cargoType = carInfo[4];
            List<Tire> tireList = new ArrayList<>();
            for (int j = 5; j < carInfo.length ; j+=2)
            {
                int tireAgeIndex = j+1;
                Tire tire = new Tire(Double.parseDouble(carInfo[j]),Integer.parseInt(carInfo[tireAgeIndex]));
                tireList.add(tire);
            }
            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Car car = new Car(model, engine, cargo,tireList);
            carList.add(car);
        }
        String cargoType = scanner.nextLine();
        if(cargoType.equals("fragile"))
        {
            for (int i = 0; i < carList.size(); i++)
            {
                if(carList.get(i).getCargo().getCargoType().equals("fragile"))
                {
                    for (int j = 0; j < 4; j++)
                    {
                        if(carList.get(i).getTires().get(j).getPressure() < 1)
                        {
                            System.out.println(carList.get(i).getModel());
                            break;
                        }
                    }
                }
            }
        }
        else if(cargoType.equals("flamable"))
        {
            for (int i = 0; i < carList.size(); i++)
            {
                if(carList.get(i).getCargo().getCargoType().equals("flamable"))
                {
                    if(carList.get(i).getEngine().getPower() > 250)
                    {
                        System.out.println(carList.get(i).getModel());
                    }
                }
            }
        }
    }
}
