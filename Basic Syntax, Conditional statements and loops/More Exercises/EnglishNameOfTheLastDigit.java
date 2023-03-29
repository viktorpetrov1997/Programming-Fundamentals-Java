package basic.syntax.more.exercises;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        System.out.println(returnNameOfLastNumber(number));
    }

    public static String returnNameOfLastNumber(String number)
    {
        String[] namesOfNumbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        char lastNumber = number.charAt(number.length() - 1);
        String last = "";

        if(lastNumber == '0')
        {
            last = "zero";
        }
        else if(lastNumber == '1')
        {
            last = "one";
        }
        else if(lastNumber == '2')
        {
            last = "two";
        }
        else if(lastNumber == '3')
        {
            last = "three";
        }
        else if(lastNumber == '4')
        {
            last = "four";
        }
        else if(lastNumber == '5')
        {
            last = "five";
        }
        else if(lastNumber == '6')
        {
            last = "six";
        }
        else if(lastNumber == '7')
        {
            last = "seven";
        }
        else if(lastNumber == '8')
        {
            last = "eight";
        }
        else if(lastNumber == '9')
        {
            last = "nine";
        }
        return last;
    }
}
