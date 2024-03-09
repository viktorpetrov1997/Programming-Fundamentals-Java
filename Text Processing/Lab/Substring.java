package TextProcessing.Lab;

import java.util.Scanner;

public class Substring
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String text = scanner.nextLine();

        int index = text.indexOf(word);
        while(index != -1)
        {
            text = text.replace(word,"");
            index = text.indexOf(word);
        }
        System.out.println(text);
    }
}
