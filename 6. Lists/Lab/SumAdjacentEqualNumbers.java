package Lists.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers
{
    static String joinElementsByDelimiter(List<Double> items,String delimeter)
    {
        String output = "";
        for(Double item : items)
        {
            output += (new DecimalFormat("0.#").format(item) + delimeter);
        }
        return  output;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        for(int i=0;i<numbersList.size()-1;i++)
        {
            if(numbersList.get(i).equals(numbersList.get(i + 1)))
            {
                numbersList.set(i,numbersList.get(i) + numbersList.get(i + 1));
                numbersList.remove(i + 1);
                i = -1;
            }
        }

        System.out.println(joinElementsByDelimiter(numbersList," "));
    }
}
