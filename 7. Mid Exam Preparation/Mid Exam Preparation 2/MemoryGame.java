package MidExamPreparation.MidExamPreparationTwo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int numberOfMoves = 0;

        String input = scanner.nextLine();
        while(!input.equals("end"))
        {
            ++numberOfMoves;
            String[] commandArray = input.split(" ");
            int firstIndex = Integer.parseInt(commandArray[0]);
            int secondIndex = Integer.parseInt(commandArray[1]);
            int biggerIndex = Math.max(firstIndex,secondIndex);
            int smallerIndex = Math.min(firstIndex,secondIndex);

            if(firstIndex == secondIndex || (firstIndex < 0 || firstIndex > numbers.size() - 1)
            || (secondIndex < 0 || secondIndex > numbers.size() - 1))
            {
                System.out.println("Invalid input! Adding additional elements to the board");
                int middleOfList = numbers.size() / 2;
                numbers.add(middleOfList,"-" + numberOfMoves + "a");
                numbers.add(middleOfList + 1,"-" + numberOfMoves + "a");
            }
            else
            {
                if(numbers.get(firstIndex).equals(numbers.get(secondIndex)))
                {
                    System.out.printf("Congrats! You have found matching elements - %s!%n",numbers.get(firstIndex));
                    numbers.remove(biggerIndex);
                    numbers.remove(smallerIndex);
                    if(numbers.isEmpty())
                    {
                        System.out.printf("You have won in %d turns!%n",numberOfMoves);
                        break;
                    }
                }
                else
                {
                    System.out.println("Try again!");
                }
            }
            input = scanner.nextLine();
        }

        if(!numbers.isEmpty())
        {
            System.out.println("Sorry you lose :(");
            for(String element: numbers)
            {
                System.out.print(element + " ");
            }
        }
    }
}
