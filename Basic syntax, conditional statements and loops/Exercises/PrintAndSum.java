package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class PrintAndSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //1. принтираме числата в дадения интервал -> OK
        //2. намираме сумата

        int startNumber = Integer.parseInt(scanner.nextLine()); //начало на диапазона
        int endNumber = Integer.parseInt(scanner.nextLine()); //край на диапазона

        //начална стойност: startNumber
        //крайна стойност: endNumber
        //повтаряме: отпечатваме числото + добавяме към сумата
        int sum = 0;
        for (int number = startNumber; number <= endNumber; number++) {
            System.out.print(number + " ");
            sum += number; //sum = sum + number;
        }

        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
