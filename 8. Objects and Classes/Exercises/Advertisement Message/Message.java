package ObjectsAndClasses.Exercises.AdvertisementMessage;

import java.util.Random;

public class Message
{
    public String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
    public String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
    public String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
    public String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

    Random random = new Random();

    public void randomMessage()
    {
        System.out.printf("%s %s %s - %s."
                , phrases[random.nextInt(phrases.length)]
                , events[random.nextInt(events.length)]
                , authors[random.nextInt(authors.length)]
                , cities[random.nextInt(cities.length)]);

        System.out.println();
    }
}
