package ExamPreparation.ExamPreparationOne;

import java.util.Scanner;

public class ActivationKeys
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String input = scanner.nextLine();
        while(!input.equals("Generate"))
        {
            String[] commandArray = input.split(">>>");
            String command = commandArray[0];
            if(command.equals("Contains"))
            {
                String substring = commandArray[1];
                if(activationKey.contains(substring))
                {
                    System.out.printf("%s contains %s%n",activationKey,substring);
                }
                else
                {
                    System.out.println("Substring not found!");
                }
            }
            else if(command.equals("Flip"))
            {
                String upperOrLowerCasing = commandArray[1];
                int startIndex = Integer.parseInt(commandArray[2]);
                int endIndex = Integer.parseInt(commandArray[3]);
                String substring = activationKey.substring(startIndex,endIndex);

                if(upperOrLowerCasing.equals("Upper"))
                {
                    activationKey = activationKey.replace(substring,substring.toUpperCase());
                }
                else
                {
                    activationKey = activationKey.replace(substring,substring.toLowerCase());
                }
                System.out.println(activationKey);
            }
            else if(command.equals("Slice"))
            {
                int startIndex = Integer.parseInt(commandArray[1]);
                int endIndex = Integer.parseInt(commandArray[2]);
                String substring = activationKey.substring(startIndex,endIndex);
                activationKey = activationKey.replace(substring, "");
                System.out.println(activationKey);
            }
            input = scanner.nextLine();
        }

        System.out.println("Your activation key is: " + activationKey);
    }
}
