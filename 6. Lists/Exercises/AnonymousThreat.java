package Lists.Exercises;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.*;
import java.util.stream.Collectors;

public class AnonymousThreat
{
    private static boolean isValidIndex(int index, int size)
    {
        return index >= 0 && index <= size - 1;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<String> strings = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("3:1"))
        {
            String[] commandArray = input.split("\\s+");
            String command = commandArray[0];
            if(command.equals("merge"))
            {
                //int startIndex = Math.max(0,Integer.parseInt(commandArray[1]));
                //int endIndex = Math.min(Integer.parseInt(commandArray[2]),strings.size() - 1);

                int startIndex = Integer.parseInt(commandArray[1]);
                int endIndex = Integer.parseInt(commandArray[2]);

                if(startIndex < 0)
                {
                    startIndex = 0;
                }

                if(endIndex > strings.size() - 1)
                {
                    endIndex = strings.size() - 1;
                }

                boolean isStartIndexValid = isValidIndex(startIndex,strings.size());
                boolean isEndIndexValid = isValidIndex(endIndex,strings.size());

                if(isStartIndexValid && isEndIndexValid)
                {
                    StringBuilder str = new StringBuilder();
                    for(int i = startIndex; i <= endIndex; i++)
                    {
                        str.append(strings.get(i));
                    }

                    for(int i = startIndex; i <= endIndex; i++)
                    {
                        strings.remove(startIndex);
                    }
                    strings.add(startIndex, str.toString());
                }
            }
            else if(command.equals("divide"))
            {
                int index = Integer.parseInt(commandArray[1]);
                int partitions = Integer.parseInt(commandArray[2]);
                String elementForDivide = strings.get(index);
                int partSize = elementForDivide.length() / partitions;
                strings.remove(index);

                int begin = 0;
                for(int i = 1; i < partitions; i++)
                {
                    strings.add(index,elementForDivide.substring(begin, begin + partSize));
                    index++;
                    begin += partSize;
                }
                strings.add(index,elementForDivide.substring(begin));
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(" ",strings));
    }
}
