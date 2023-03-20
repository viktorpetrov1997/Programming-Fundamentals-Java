package ObjectsAndClasses.Exercises.AdvertisementMessage;

import java.util.Scanner;

public class AdvertisementMessageSecondWay //tozi klas izpolzva klasa Message
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Message message = new Message();

        for (int i = 0; i < n; i++)
        {
            message.randomMessage();
        }
    }
}
