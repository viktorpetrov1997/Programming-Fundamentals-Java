package DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class BalancedBrackets
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countOpeningBracket = 0;
        int countClosingBracket = 0;
        for(int i=0;i<n;i++)
        {
            String input = scanner.nextLine();
            if(input.equals("("))
            {
                countOpeningBracket++;
            }
            else if(input.equals(")"))
            {
                countClosingBracket++;
                if(countOpeningBracket - countClosingBracket != 0)
                {
                    break;
                }
            }
        }
        if(countOpeningBracket - countClosingBracket != 0)
        {
            System.out.println("UNBALANCED");
        }
        else
        {
            System.out.println("BALANCED");
        }
    }
}
