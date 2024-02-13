package DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class DataTypeFinder
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while(!"END".equals(input))
        {
            int integer = 0;
            int floating = 0;
            boolean flotPoint = false;
            String type = "string";

            if(input.length() == 1)
            {
                char current = input.charAt(0);
                if((current >= 48 && current <= 57))
                {
                    type = "integer";
                }
                else
                {
                    type = "character";
                }
            }
            else
            {
                for (int i = 0; i < input.length(); i++)
                {
                    char current = input.charAt(i);
                    if (i == 0 && current == 45)
                    {
                        integer++;
                    }
                    if ((current >= 48 && current <= 57) || current == 46)
                    {
                        integer++;
                        if (current == 46)
                        {
                            floating++;
                            flotPoint = true;
                        }
                    }
                }
            }
            if (integer == input.length())
            {
                if (flotPoint && floating == 1)
                {
                    type = "floating point";
                }
                else if (floating > 1)
                {

                }
                else
                {
                    type = "integer";
                }
            }

            String checkBl = input.toLowerCase();
            switch (checkBl)
            {
                case "true":
                case "false":
                    type = "boolean";
            }

            System.out.printf("%s is %s type%n", input, type);
            input = scanner.nextLine();
        }
    }
}
