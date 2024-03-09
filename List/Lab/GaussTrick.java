package Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sizeList = numbersList.size(); //tuk trqbva da postavim tova v otdelna promenliva zashtoto inache v cikyla numberList.size() neprekusnato shte namalqva
        //zashtoto v cikyla premahvame element ot lista. Za da ne namalqvame slagame fiksiraniq razmer na lista v otdelna promenliva
        for(int i=0;i<sizeList / 2;i++)
        {
            int firstNum = numbersList.get(i);
            int secondNum = numbersList.get(numbersList.size() - 1);
            numbersList.set(i,firstNum + secondNum);
            numbersList.remove(numbersList.size() - 1);
        }

        for(int item : numbersList)
        {
            System.out.print(item + " ");
        }
    }
}
