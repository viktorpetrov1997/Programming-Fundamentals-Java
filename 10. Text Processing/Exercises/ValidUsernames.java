package TextProcessing.Exercises;

import java.util.Scanner;

public class ValidUsernames
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for(String username : usernames)
        {
            boolean isValid = true;
            for(char symbol : username.toCharArray())
            {
                if(!(symbol == '-' || symbol == '_' || Character.isLetterOrDigit(symbol))
                || (username.length() < 3 || username.length() > 16))
                {
                    isValid = false;
                    break;
                }
            }
            if(isValid)
            {
                System.out.println(username);
            }
        }
    }
}
