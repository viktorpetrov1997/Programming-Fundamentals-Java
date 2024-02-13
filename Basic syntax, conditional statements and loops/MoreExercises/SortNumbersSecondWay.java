package BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class SortNumbersSecondWay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
        //Integer[] numbers = new Integer[3]; - another way

        for(int i=0;i<numbers.length;i++)
        {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        //Arrays.sort(numbers, Collections.reverseOrder()); - another way

        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i] < numbers[j])
                {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for(int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
