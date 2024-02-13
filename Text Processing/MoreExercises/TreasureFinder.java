package TextProcessing.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringBuilder decryptedMessage = new StringBuilder();

        String input = scanner.nextLine();
        while(!input.equals("find"))
        {
            int numbersIndex = -1;
            for(int i = 0; i < input.length(); i++)
            {
                char newChar = (char) (input.charAt(i) - numbers[++numbersIndex]);
                decryptedMessage.append(newChar);
                if(numbersIndex == numbers.length - 1)
                {
                    numbersIndex = -1;
                }
            }
            int treasureStart = decryptedMessage.indexOf("&") + 1;
            int treasureEnd = decryptedMessage.indexOf("&", treasureStart);
            String treasure = decryptedMessage.substring(treasureStart, treasureEnd);

            int coordinatesStart = decryptedMessage.indexOf("<") + 1;
            int coordinatesEnd = decryptedMessage.indexOf(">", coordinatesStart);
            String coordinates = decryptedMessage.substring(coordinatesStart, coordinatesEnd);

            System.out.printf("Found %s at %s%n",treasure,coordinates);

            decryptedMessage = new StringBuilder("");
            input = scanner.nextLine();
        }
    }
}
