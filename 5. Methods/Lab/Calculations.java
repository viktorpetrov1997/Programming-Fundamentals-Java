package Methods.Lab;

import java.util.Scanner;

public class Calculations
{
    private  static void add(int a, int b)
    {
        System.out.println(a + b);
    }

    private  static void subtract(int a, int b)
    {
        System.out.println(a - b);
    }

    private  static void multiply(int a, int b)
    {
        System.out.println(a * b);
    }

    private  static void divide(int a, int b)
    {
        System.out.println(a / b);
    }


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if(command.equals("add"))
        {
            add(a,b);
        }
        else if(command.equals("subtract"))
        {
            subtract(a,b);
        }
        else if(command.equals("multiply"))
        {
            multiply(a,b);
        }
        else if(command.equals("divide"))
        {
            divide(a,b);
        }
    }
}
