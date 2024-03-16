package TextProcessing.Lab;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RepeatStrings
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        String result = "";
        for(String s : wordsArr)
        {
            for(int i = 0; i < s.length(); i++)
            {
                result += s;
            }
        }
        System.out.println(result);
    }
}
