package MapsLambdaAndStreamAPI.Lab;

import java.util.*;

public class CountRealNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double,Integer> numbers = new TreeMap<>();

        for(double number : nums)
        {
            if(!numbers.containsKey(number))
            {
                numbers.put(number,1);
            }
            else
            {
                int value = numbers.get(number);
                numbers.put(number,value + 1);
            }
        }

        for(Map.Entry<Double, Integer> entry : numbers.entrySet())
        {
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
