package ObjectsAndClasses.MoreExercises.RawData;

import java.util.List;

public class Car
{
    String model;
    Engine engine;
    Cargo cargo;
    List<Tire> tires;

    public Car(String model, Engine engine, Cargo cargo, List<Tire> tires)
    {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public String getModel()
    {
        return model;
    }

    public Engine getEngine()
    {
        return engine;
    }

    public Cargo getCargo()
    {
        return cargo;
    }

    public List<Tire> getTires()
    {
        return tires;
    }
}
