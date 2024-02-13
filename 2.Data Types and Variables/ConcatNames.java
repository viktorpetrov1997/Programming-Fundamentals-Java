package DataTypesAndVariables;

import java.util.Scanner;

public class ConcatNames
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.printf(firstName + delimiter + lastName);
    }
}
