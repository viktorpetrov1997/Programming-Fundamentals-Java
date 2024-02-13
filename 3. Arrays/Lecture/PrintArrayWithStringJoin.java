package Arrays.Lecture;

import java.util.Scanner;

public class PrintArrayWithStringJoin
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] daysOfWeek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        System.out.println(String.join(", ",daysOfWeek));
    }
}
