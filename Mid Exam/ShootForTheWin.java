package mid.exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        int shotTargets = 0;
        String input = scanner.nextLine();
        while(!input.equals("End"))
        {
            int index = Integer.parseInt(input);
            if(index >= 0 && index < targets.size())
            {
                if(targets.get(index) != -1)
                {
                    for (int i = 0; i < targets.size(); i++)
                    {
                        if (i != index && targets.get(i) != -1)
                        {
                            if(targets.get(i) > targets.get(index))
                            {
                                targets.set(i,targets.get(i) - targets.get(index));
                            }
                            else if(targets.get(i) <= targets.get(index))
                            {
                                targets.set(i,targets.get(i) + targets.get(index));
                            }
                        }
                    }
                    targets.set(index,-1);
                    ++shotTargets;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ",shotTargets);
        for(int target: targets)
        {
            System.out.print(target + " ");
        }
    }
}
