package arrays.more.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[fieldSize];

        int[] indexesOfLadyBugs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int index : indexesOfLadyBugs)
        {
            if (index >= 0 && index < fieldSize)
            {
                field[index] = 1;
            }
        }

        /*
        for(int i=0;i<indexesOfLadyBugs.length;i++)
        {
            int index = indexesOfLadyBugs[i];
            if(index >= 0 && index < fieldSize)
            {
                field[index] = 1;
            }
        }*/

        String input = scanner.nextLine();
        while(!input.equals("end"))
        {
            String[] command = input.split(" ");
            int indexOfLadyBug = Integer.parseInt(command[0]);
            String direction = command[1];
            int numberOfMoves = Integer.parseInt(command[2]);

            if((indexOfLadyBug >= 0 && indexOfLadyBug < field.length) && field[indexOfLadyBug] == 1)
            {
                field[indexOfLadyBug] = 0;
                if(direction.equals("right"))
                {
                    indexOfLadyBug += numberOfMoves;

                    while(indexOfLadyBug < field.length  && field[indexOfLadyBug] == 1) //proverkata dali indeksa se namira vav poleta trqbva da e predi proverkata dali ima kalinka na sledvashtata poziciq, zashtoto inache izliza "array out of range" greshka pri proverkata za kalinkata v masiva field.Sushtoto vaji i za drugite takiva proverki v programata
                    {
                        indexOfLadyBug += numberOfMoves;
                    }

                    if(indexOfLadyBug < field.length)
                    {
                        field[indexOfLadyBug] = 1;
                    }
                }
                else if(direction.equals("left"))
                {
                    indexOfLadyBug -= numberOfMoves;

                    while(indexOfLadyBug >= 0 && field[indexOfLadyBug] == 1)
                    {
                        indexOfLadyBug -= numberOfMoves;
                    }

                    if(indexOfLadyBug >= 0)
                    {
                        field[indexOfLadyBug] = 1;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int ladyBug : field)
        {
            System.out.print(ladyBug + " ");
        }
    }
}
