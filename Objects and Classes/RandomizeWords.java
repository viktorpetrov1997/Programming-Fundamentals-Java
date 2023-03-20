package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] wordsArray = input.split(" ");

        Random random = new Random();
        for (int i = 0; i < wordsArray.length; i++)
        {
            int indexX = random.nextInt(wordsArray.length);
            int indexY = random.nextInt(wordsArray.length);

            String word = wordsArray[indexX];
            wordsArray[indexX] = wordsArray[indexY];
            wordsArray[indexY] = word;
        }
        System.out.println(String.join(System.lineSeparator(),wordsArray)); //lineSeparator printira s String.join na nov red vmesto an edin
    }
}
