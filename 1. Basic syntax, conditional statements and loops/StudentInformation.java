package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class StudentInformation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());

        System.out.println("Name: " + studentName + ", Age: " + age + ", Grade: " + grade);
    }
}
