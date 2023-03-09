package methods.exercises;

import java.util.Scanner;

public class PasswordValidator
{
    private static boolean isValidLength(String password)
    {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean isValidContent(String password)
    {
        for(int i=0;i<password.length();i++)
        {
            if(!Character.isLetterOrDigit(password.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidCountDigits(String password)
    {
        int numberOfDigits = 0;
        for(int i=0;i<password.length();i++)
        {
            if(Character.isDigit(password.charAt(i)))
            {
                ++numberOfDigits;
            }
        }
        return numberOfDigits >= 2;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isPasswordValidLength = isValidLength(password);
        if (!isPasswordValidLength)
        {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isValidPasswordContent = isValidContent(password);
        if (!isValidPasswordContent)
        {
            System.out.println("Password must consist only of letters and digits");
        }


        boolean isValidPasswordCountDigits = isValidCountDigits(password);
        if (!isValidPasswordCountDigits)
        {
            System.out.println("Password must have at least 2 digits");
        }

        if (isPasswordValidLength && isValidPasswordContent && isValidPasswordCountDigits)
        {
            System.out.println("Password is valid");
        }
    }
}
