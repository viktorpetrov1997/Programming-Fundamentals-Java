package ObjectsAndClasses.MoreExercises.CarSalesman;

public class Car
{
    String model;
    Engine engine;
    String weight;
    String color;
    public Car(String model, Engine engine)
    {
        this.model = model;
        this.engine = engine;
        this.weight = "n/a";
        this.color = "n/a";
    }
    public void setWeight(String weight)
    {
        this.weight = weight;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public Engine getEngine()
    {
        return engine;
    }

    @Override
    public String toString()
    {
        Engine eng = this.getEngine();
        return String.format("%s:%n  %s:%n    Power: %s%n    Displacement: %s%n    Efficiency: %s%n  Weight: %s%n  Color: %s",
                this.model,eng.getModel(),eng.getPower(),eng.getDisplacement(),eng.getEfficiency(),this.weight,this.color);
    }
}
