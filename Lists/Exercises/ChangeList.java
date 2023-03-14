import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("end"))
        {
            String[] commandArray = input.split(" ");
            String command = commandArray[0];
            if(command.equals("Delete"))
            {
                int element = Integer.parseInt(commandArray[1]);
                for (int i = 0; i < numbers.size(); i++)
                {
                    if(numbers.get(i) == element)
                    {
                        numbers.remove(i);
                    }
                }
            }
            else if(command.equals("Insert"))
            {
                int element = Integer.parseInt(commandArray[1]);
                int index = Integer.parseInt(commandArray[2]);
                numbers.add(index,element);
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
