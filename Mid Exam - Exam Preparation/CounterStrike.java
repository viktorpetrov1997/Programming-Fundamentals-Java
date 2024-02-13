package MidExam;

import java.util.Scanner;

public class CounterStrike
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());
        int battlesWon = 0;

        String input = scanner.nextLine();
        while(!input.equals("End of battle"))
        {
            int distance = Integer.parseInt(input);

            if(initialEnergy < distance)
            {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",battlesWon,initialEnergy);
                break;
            }
            else
            {
                ++battlesWon;
                initialEnergy -= distance;
                if(battlesWon % 3 == 0)
                {
                    initialEnergy += battlesWon;
                }
            }
            input = scanner.nextLine();
        }
        if(input.equals("End of battle"))
        {
            System.out.printf("Won battles: %d. Energy left: %d", battlesWon, initialEnergy);
        }
    }
}