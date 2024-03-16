package ObjectsAndClasses.Exercises.GroomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon
{
    private int capacity;
    private List<Pet> data;
    public GroomingSalon(int capacity)
    {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet)
    {
        if(this.data.size() < capacity)
        {
            this.data.add(pet);
        }
    }

    public boolean remove(String petName)
    {
        for (int i = 0; i < data.size(); i++)
        {
            if(data.get(i).getName().equals(petName))
            {
                this.data.remove(i);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner)
    {
        for(Pet pet : data)
        {
            if(pet.getName().equals(name) && pet.getOwner().equals(owner))
            {
                return pet;
            }
        }
        return null;
    }

    public int getCount()
    {
        return this.data.size();
    }

    public String getStatistics()
    {
        StringBuilder builder = new StringBuilder("The grooming salon has the following clients:"  + System.lineSeparator());

        for (Pet pet : data)
        {
            builder.append(pet.getName());
            builder.append(" ");
            builder.append(pet.getOwner());
            builder.append(System.lineSeparator());
        }
        return builder.toString().trim();
    }
}
