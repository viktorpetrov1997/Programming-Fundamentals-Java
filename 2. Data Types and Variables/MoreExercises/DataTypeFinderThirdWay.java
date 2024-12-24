package DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class DataTypeFinderThirdWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!input.equals("END"))
        {
            String type = "";

            if(input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false"))
            {
                type = "boolean";
            } 
            else if(input.length() == 1)
            {
                char symbol = input.charAt(0);
                if(symbol < 47 || symbol > 58)
                {
                    type = "character";
                } 
                else 
                
                {
                    type = "integer";
                }
            }
            else
            {
                boolean isString = false;
                boolean isFloating = false;
                for(int i = 0; i < input.length(); i++)
                {
                    char currentItem = input.charAt(i);
                    if(currentItem < 45 || currentItem > 57)
                    {
                        isString = true;
                    }

                    if(input.charAt(i) == 46)
                    {
                        isFloating = true;
                    }
                }
                if(isString)
                {
                    type = "string";
                }
                else
                {
                    if(isFloating)
                    {
                        type = "floating point";
                    }
                    else
                    {
                        type = "integer";
                    }
                }
            }

            System.out.printf("%s is %s type%n", input, type);
            input = scanner.nextLine();
        }
    }
}
