package Methods.Lab;

import java.util.Scanner;

public class Grades
{
    /*public static String printGradeInWords(double grade)
    {
        String gradeInWords = "";
        if(grade >= 2 && grade <= 2.99)
        {
            gradeInWords = "Fail";
        }
        else if(grade >= 3 && grade <= 3.49)
        {
            gradeInWords = "Poor";
        }
        else if(grade >= 3.50 && grade <= 4.49)
        {
            gradeInWords = "Good";
        }
        else if(grade >= 4.50 && grade <= 5.49)
        {
            gradeInWords = "Very good";
        }
        else if(grade >= 5.50 && grade <= 6)
        {
            gradeInWords = "Excellent";
        }
        return  gradeInWords;
    } Second way by returning the string from a method*/

    public static void printGradeInWords(double grade)
    {
        String gradeInWords = "";

        if(grade >= 2 && grade <= 2.99)
        {
            gradeInWords = "Fail";
        }
        else if(grade >= 3 && grade <= 3.49)
        {
            gradeInWords = "Poor";
        }
        else if(grade >= 3.50 && grade <= 4.49)
        {
            gradeInWords = "Good";
        }
        else if(grade >= 4.50 && grade <= 5.49)
        {
            gradeInWords = "Very good";
        }
        else if(grade >= 5.50 && grade <= 6)
        {
            gradeInWords = "Excellent";
        }

        System.out.println(gradeInWords);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        printGradeInWords(grade);

        //System.out.println(printGradeInWords(grade)); Second way by returning the string from a method
    }
}
