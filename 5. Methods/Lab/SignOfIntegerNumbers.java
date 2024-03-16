package Methods.Lab;

import java.util.Scanner;

public class SignOfIntegerNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printSign(number);

        //printSign(Integer.parseInt(scanner.nextLine())); vtori nachin da go izvikam kato direkto vuvejdam chisloto po tozi nachin bez predvaritelno da go deklariram
    }

    public static void printSign(int num) {
        if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}

