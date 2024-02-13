package Methods.Exercises;

import java.util.Scanner;

public class PasswordValidatorThirdWay
{
    private static boolean isValidLength(String password)
    {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean isValidContent(String password)
    {
        String digits = "0123456789";
        for(int i=0;i<password.length();i++)
        {
            String currentDigit = String.valueOf(password.charAt(i));
            if(!digits.contains(currentDigit) && ((password.charAt(i) >= 0 && password.charAt(i) <= 47)
                    || (password.charAt(i) >= 58 && password.charAt(i) <= 64) || (password.charAt(i) >= 91 && password.charAt(i) <= 96)
                    || (password.charAt(i) >= 123 && password.charAt(i) <= 127)))
            {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidCountDigits(String password)
    {
        String digits = "0123456789";
        int numberOfDigits = 0;
        for(int i=0;i<password.length();i++)
        {
            String currentDigit = String.valueOf(password.charAt(i));
            if(digits.contains(currentDigit))
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
