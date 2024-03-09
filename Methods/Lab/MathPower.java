package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower
{
    private static double mathPower(double number, int power)
    {
        /*double result = 1;
        for(int i=0;i<power;i++)
        {
            result *= number;
        }
        return result;* vtori nachin za izchislqvane na stepen*/
        double result = Math.pow(number,power);
        return result;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####"); //Ako ima drobna chast da se printira s maks 4 znaka sled zapetaqta.Ako nqma da ne se printira i da printira samo integer-a

        double result = mathPower(number,power);

        System.out.println(df.format(result));
    }
}
