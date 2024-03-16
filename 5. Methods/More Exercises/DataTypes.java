package Methods.MoreExercises;

import java.util.Scanner;

public class DataTypes
{
    private static int printNumber(int number)
    {
        return number * 2;
    }

    private static double printNumber(double number)
    {
        return number * 1.5;
    }

    private static String printNumber(String number)
    {
        return "$" + number + "$";
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine();

        if(dataType.equals("int"))
        {
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println(printNumber(number));
        }
        else if(dataType.equals("real"))
        {
            double number = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.2f",printNumber(number));
        }
        else if(dataType.equals("string"))
        {
            String number = scanner.nextLine();
            System.out.println(printNumber(number));
        }
    }
}
