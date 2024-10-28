package Methods.Lab;

import java.util.Scanner;

public class MathOperations
{
    private static int calculate(int a, String operator, int b)
    {
        int result = 0;

        if(operator.equals("+"))
        {
            result = a + b;
        }
        else if(operator.equals("-"))
        {
            result = a - b;
        }
        else if(operator.equals("*"))
        {
            result = a * b;
        }
        else if(operator.equals("/"))
        {
            result = a / b;
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println(calculate(a,operator,b));
    }
}
