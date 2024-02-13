package ObjectsAndClasses.MoreExercises.CarSalesman;

public class Engine
{
    String model;
    String power;
    String displacement;
    String efficiency;

    public Engine(String model, String power)
    {
        this.model = model;
        this.power = power;
        this.displacement = "n/a";
        this.efficiency = "n/a";
    }

    public void setDisplacement(String displacement)
    {
        this.displacement = displacement;
    }

    public void setEfficiency(String efficiency)
    {
        this.efficiency = efficiency;
    }

    public String getModel()
    {
        return model;
    }

    public String getPower()
    {
        return power;
    }

    public String getDisplacement()
    {
        return displacement;
    }

    public String getEfficiency()
    {
        return efficiency;
    }
}
