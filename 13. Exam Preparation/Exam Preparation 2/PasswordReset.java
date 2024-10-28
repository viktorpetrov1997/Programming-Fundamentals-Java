package ExamPreparation.ExamPreparationTwo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordReset
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String input = scanner.nextLine();
        while(!input.equals("Done"))
        {
            String[] commandArray = input.split(" ");
            String command = commandArray[0];
            if(command.equals("TakeOdd"))
            {
                StringBuilder newPassword = new StringBuilder();
                for(int i = 1; i < password.length(); i+=2)
                {
                    newPassword.append(password.charAt(i));
                }
                password = newPassword.toString();
                System.out.println(password);
            }
            else if(command.equals("Cut"))
            {
                int index = Integer.parseInt(commandArray[1]);
                int length = Integer.parseInt(commandArray[2]);

                String toBeRemoved = password.substring(index,index + length);
                password = password.replaceFirst(toBeRemoved,"");
                System.out.println(password);
            }
            else if(command.equals("Substitute"))
            {
                String substring = commandArray[1];
                String substitute = commandArray[2];

                if(password.contains(substring))
                {
                    password = password.replace(substring,substitute);
                    System.out.println(password);
                }
                else
                {
                    System.out.println("Nothing to replace!");
                }
            }
            input = scanner.nextLine();
        }

        System.out.println("Your password is: " + password);
    }
}
