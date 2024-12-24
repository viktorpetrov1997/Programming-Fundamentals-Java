package Lists.MoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSet = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> initialQuality = new ArrayList<>(drumSet);

        String input = scanner.nextLine();
        while(!input.equals("Hit it again, Gabsy!"))
        {
            int hitPower = Integer.parseInt(input);

            /*for (int i = 0; i < drumSet.size(); i++)
            {
                drumSet.set(i, drumSet.get(i) - hitPower);
            } vtori nachin da namalim stoinostite na barabanite (v otdelen cikyl a ne samo v edin)*/

            for(int i = 0; i < drumSet.size(); i++)
            {
                drumSet.set(i, drumSet.get(i) - hitPower);
                if(drumSet.get(i) <= 0)
                {
                    if(savings - initialQuality.get(i) * 3 > 0)
                    {
                        drumSet.set(i, initialQuality.get(i));
                        savings -= initialQuality.get(i) * 3;
                    }
                    else
                    {
                        drumSet.remove(i);
                        initialQuality.remove(i);
                        --i;
                    }
                }
            }
            input = scanner.nextLine();
        }

        for(int drum: drumSet)
        {
            System.out.print(drum + " ");
        }
        System.out.printf("%nGabsy has %.2flv.",savings);
    }
}
