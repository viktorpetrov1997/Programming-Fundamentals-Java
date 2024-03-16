package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList();

        String input = scanner.nextLine();
        while(!input.equals("end"))
        {
            String[] commandArr = input.split(" ");
            String command = commandArr[0];
            if(command.contains("Print"))
            {
                command = commandArr[1];
            }
            if(command.equals("Contains"))
            {
                if(numbersList.contains(Integer.parseInt(commandArr[1])))
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No such number");
                }
            }
            else if(command.equals("even"))
            {
                for(int i=0;i<numbersList.size();i++)
                {
                    if(numbersList.get(i) % 2 == 0)
                    {
                        if(i == numbersList.size() - 1)
                        {
                            System.out.printf(String.valueOf(numbersList.get(i)));
                        }
                        else
                        {
                            System.out.printf(numbersList.get(i) + " ");
                        }
                    }
                }
                System.out.println();
            }
            else if(command.equals("odd"))
            {
                for(int i=0;i<numbersList.size();i++)
                {
                    if(numbersList.get(i) % 2 != 0)
                    {
                        if(i == numbersList.size() - 1)
                        {
                            System.out.printf(String.valueOf(numbersList.get(i)));
                        }
                        else
                        {
                            System.out.printf(numbersList.get(i) + " ");
                        }
                    }
                }
                System.out.println();
            }
            else if(command.equals("Get"))
            {
                int sum = 0;
                for(int i=0;i<numbersList.size();i++)
                {
                    sum += numbersList.get(i);
                }
                System.out.println(sum);
            }
            else if(command.equals("Filter"))
            {
                String condition = commandArr[1];
                int number = Integer.parseInt(commandArr[2]);
                for(int i=0;i<numbersList.size();i++)
                {
                    int currentValue = numbersList.get(i);
                    if(condition.equals("<"))
                    {
                        if(numbersList.get(i) < number)
                        {
                            if(i == numbersList.size() - 1)
                            {
                                System.out.printf(String.valueOf(numbersList.get(i)));
                            }
                            else
                            {
                                System.out.printf(numbersList.get(i) + " ");
                            }
                        }
                    }
                    else if(condition.equals(">"))
                    {
                        if(numbersList.get(i) > number)
                        {
                            if(i == numbersList.size() - 1)
                            {
                                System.out.printf(String.valueOf(numbersList.get(i)));
                            }
                            else
                            {
                                System.out.printf(numbersList.get(i) + " ");
                            }
                        }
                    }
                    else if(condition.equals("<="))
                    {
                        if(numbersList.get(i) <= number)
                        {
                            if(i == numbersList.size() - 1)
                            {
                                System.out.printf(String.valueOf(numbersList.get(i)));
                            }
                            else
                            {
                                System.out.printf(numbersList.get(i) + " ");
                            }
                        }
                    }
                    else if(condition.equals(">="))
                    {
                        if(numbersList.get(i) >= number)
                        {
                            if(i == numbersList.size() - 1)
                            {
                                System.out.printf(String.valueOf(numbersList.get(i)));
                            }
                            else
                            {
                                System.out.printf(numbersList.get(i) + " ");
                            }
                        }
                    }
                }
                System.out.println();
            }
            input = scanner.nextLine();
        }
    }
}