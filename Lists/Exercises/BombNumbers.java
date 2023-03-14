import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt).collect(Collectors.toList());

        String[] input = scanner.nextLine().split("\\s+");
        int bombNumber = Integer.parseInt(input[0]);
        int power = Integer.parseInt(input[1]);


        while(numbers.contains(bombNumber))
        {
            int elementIndex = numbers.indexOf(bombNumber);

            int left = Math.max(0,elementIndex - power);

            int right = Math.min(elementIndex + power,numbers.size() - 1);

            for (int i = right; i >= left ; i--)
            {
                numbers.remove(i);
            }
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++)
        {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }
}
