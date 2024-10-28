package MapsLambdaAndStreamAPI.Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> parkingLotInfo = new LinkedHashMap<>();

        for(int i = 0; i < n; i++)
        {
            String[] parkingInfo = scanner.nextLine().split(" ");
            String command = parkingInfo[0];
            if(command.equals("register"))
            {
                String username = parkingInfo[1];
                String licensePlate = parkingInfo[2];
                if(!parkingLotInfo.containsKey(username))
                {
                    parkingLotInfo.put(username,licensePlate);
                    System.out.printf("%s registered %s successfully%n",username,licensePlate);
                }
                else
                {
                    System.out.printf("ERROR: already registered with plate number %s%n",licensePlate);
                }
            }
            else if(command.equals("unregister"))
            {
                String username = parkingInfo[1];
                if(!parkingLotInfo.containsKey(username))
                {
                    System.out.printf("ERROR: user %s not found%n",username);
                }
                else
                {
                    parkingLotInfo.remove(username);
                    System.out.printf("%s unregistered successfully%n",username);
                }
            }
        }
        parkingLotInfo.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
