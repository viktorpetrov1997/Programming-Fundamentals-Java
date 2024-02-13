package ObjectsAndClasses.MoreExercises.RawData;

public class Cargo
{
    int cargoWeight;
    String cargoType;

    public Cargo(int cargoWeight, String cargoType)
    {
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }

    public int getCargoWeight()
    {
        return cargoWeight;
    }

    public String getCargoType()
    {
        return cargoType;
    }
}
