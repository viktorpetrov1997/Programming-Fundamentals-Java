package Methods.Exercises;

import java.util.Scanner;

public class AddAndSubtract
{
    private static int sum(int firstInteger, int secondInteger)
    {
        return firstInteger + secondInteger;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int firstInteger = Integer.parseInt(scanner.nextLine());
        int secondInteger = Integer.parseInt(scanner.nextLine());
        int thirdInteger = Integer.parseInt(scanner.nextLine());

        int sum = sum(firstInteger,secondInteger);
        int result = sum - thirdInteger;
        System.out.println(result);
    }
}
