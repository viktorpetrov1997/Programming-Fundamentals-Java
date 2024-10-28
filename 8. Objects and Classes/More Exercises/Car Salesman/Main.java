package ObjectsAndClasses.MoreExercises.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static boolean isNumeric(String str)
    {
        for(char c : str.toCharArray())
        {
            if(!Character.isDigit(c)) return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        List<Engine> engineList = new ArrayList<>();
        for(int i = 0; i < N; i++)
        {
            String[] engineInfo = scanner.nextLine().split(" ");

            String engineModel = engineInfo[0];
            String power = engineInfo[1];

            Engine engine = new Engine(engineModel,power);

            if(engineInfo.length == 3)
            {
                if(isNumeric(engineInfo[2]))
                {
                    engine.setDisplacement(engineInfo[2]);
                }
                else
                {
                    engine.setEfficiency(engineInfo[2]);
                }
            }
            else if(engineInfo.length == 4)
            {
                engine.setDisplacement(engineInfo[2]);
                engine.setEfficiency(engineInfo[3]);
            }
            engineList.add(engine);
        }

        int M = Integer.parseInt(scanner.nextLine());

        List<Car> carList = new ArrayList<>();
        for(int i = 0; i < M; i++)
        {
            String[] carInfo = scanner.nextLine().split(" ");

            String model = carInfo[0];
            String engineName = carInfo[1];
            Engine engine = null;

            for(Engine engineIndex : engineList)
            {
                if(engineIndex.getModel().equals(engineName))
                {
                    engine = engineIndex;
                    break;
                }
            }

            Car car = new Car(model,engine);

            if(carInfo.length == 3)
            {
                if(isNumeric(carInfo[2]))
                {
                    car.setWeight(carInfo[2]);
                }
                else
                {
                    car.setColor(carInfo[2]);
                }
            }
            else if(carInfo.length == 4)
            {
                car.setWeight(carInfo[2]);
                car.setColor(carInfo[3]);
            }
            carList.add(car);
        }

        for(Car car : carList)
        {
            System.out.println(car);
        }
    }
}
