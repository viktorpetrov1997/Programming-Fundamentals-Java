package BitwiseOperations.Lecture;

import java.util.Scanner;

public class FloatingPointNumberToBinary
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        float num = Float.parseFloat(scanner.nextLine());
        int bits = Float.floatToIntBits(num); //we can do it with double as well with the Double.doubleToLongBits() method.

        String binary = Integer.toBinaryString(bits);

        binary = String.format("%32s", binary).replace(' ', '0');

        System.out.println(binary);
    }
}
