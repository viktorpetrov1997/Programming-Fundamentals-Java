package Methods.Lab;

import java.util.Scanner;

public class RepeatString
{
    private static String repeatString(String str, int numberOfTimes)
    {
        String newString = "";
        for(int i=0;i<numberOfTimes;i++)
        {
            newString += str;
        }
        return newString;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());

        System.out.print(repeatString(string,repeat));
    }
}
