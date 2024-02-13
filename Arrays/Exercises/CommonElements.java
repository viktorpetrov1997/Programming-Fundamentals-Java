package Arrays.Exercises;

import java.util.Scanner;

public class CommonElements
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        String[] array1 = firstLine.split(" ");
        String[] array2 = secondLine.split(" ");

        for(String element: array2)
        {
            for(String elementFirst: array1)
            {
                if(elementFirst.equals(element))
                {
                    System.out.print(elementFirst + " ");
                }
            }
        }
    }
}
