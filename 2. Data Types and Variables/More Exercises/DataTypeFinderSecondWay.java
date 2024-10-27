package DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class DataTypeFinderSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            String input = scanner.nextLine();

            if (input.equals("END"))
            {
                break;
            }

            if (isInteger(input))
            {
                System.out.printf("%s is integer type\n", input);
            }
            else if (isFloatingPoint(input))
            {
                System.out.printf("%s is floating point type\n", input);
            }
            else if (isBoolean(input))
            {
                System.out.printf("%s is boolean type\n", input);
            }
            else if (isCharacter(input))
            {
                System.out.printf("%s is character type\n", input);
            }
            else
            {
                System.out.printf("%s is string type\n", input);
            }
        }
    }

    private static boolean isInteger(String input)
    {
        try
        {
            Integer.parseInt(input);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

    private static boolean isFloatingPoint(String input)
    {
        try
        {
            Double.parseDouble(input);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

    private static boolean isBoolean(String input)
    {
        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
    }

    private static boolean isCharacter(String input)
    {
        return input.length() == 1;
    }
}
