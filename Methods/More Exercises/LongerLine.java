package methods.more.exercises;

import java.util.Scanner;

public class LongerLine
{
    private static double findLineLength(int x1, int y1, int x2, int y2)
    {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    private static void findLongerLine(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
        double firstLineLength = findLineLength(x1,y1,x2,y2);
        double secondLineLength = findLineLength(x3,y3,x4,y4);

        if(firstLineLength == secondLineLength)
        {
            System.out.printf("(%d, %d)(%d, %d)",x1,y1,x2,y2);
        }
        else if(firstLineLength > secondLineLength)
        {
            double firstPointsDistanceFromCenter = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
            double secondPointsDistanceFromCenter = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
            if(firstPointsDistanceFromCenter <= secondPointsDistanceFromCenter)
            {
                System.out.printf("(%d, %d)(%d, %d)",x1,y1,x2,y2);
            }
            else
            {
                System.out.printf("(%d, %d)(%d, %d)",x2,y2,x1,y1);
            }
        }
        else
        {
            double firstPointsDistanceFromCenter = Math.sqrt(Math.pow(x3, 2) + Math.pow(y3, 2));
            double secondPointsDistanceFromCenter = Math.sqrt(Math.pow(x4, 2) + Math.pow(y4, 2));
            if(firstPointsDistanceFromCenter <= secondPointsDistanceFromCenter)
            {
                System.out.printf("(%d, %d)(%d, %d)",x3,y3,x4,y4);
            }
            else
            {
                System.out.printf("(%d, %d)(%d, %d)",x4,y4,x3,y3);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());
        findLongerLine(x1,y1,x2,y2,x3,y3,x4,y4);
    }
}
