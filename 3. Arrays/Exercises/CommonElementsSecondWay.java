package Arrays.Exercises;

import java.util.Scanner;

public class CommonElementsSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for(int j = 0; j < secondArr.length; j++)
        {
            for(int i = 0; i < firstArr.length; i++)
            {
                if(secondArr[j].equals(firstArr[i]))
                {
                    System.out.printf(secondArr[j] + " ");
                }
            }
        }
    }
}
