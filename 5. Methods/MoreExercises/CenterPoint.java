package Methods.MoreExercises;

import java.util.Scanner;

public class CenterPoint
{
    private static void printPoints(int x1, int y1, int x2, int y2)
    {
        double firstPointsDistanceFromCenter = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double secondPointsDistanceFromCenter = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

        if(firstPointsDistanceFromCenter == secondPointsDistanceFromCenter)
        {
            System.out.printf("(%d, %d)",x1,y1);
        }
        else if(firstPointsDistanceFromCenter < secondPointsDistanceFromCenter)
        {
            System.out.printf("(%d, %d)",x1,y1);
        }
        else
        {
            System.out.printf("(%d, %d)",x2,y2);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        printPoints(x1,y1,x2,y2);
    }
}
