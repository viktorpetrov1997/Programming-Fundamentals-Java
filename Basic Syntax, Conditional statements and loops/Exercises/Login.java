package basic.syntax.exercises;

import java.util.Scanner;

public class Login
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //1. намираме паролата за username
        String username = scanner.nextLine();
        //Acer -> pass: recA
        String password = "";
        //обхождам всички букви от последната (дълж. - 1) към първата (0)
        //всяка една буква я добавям към паролата

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }

        //стоп: вход == паролата
        //продължаваме да въвеждаме: вход != паролата
        //повтаряме: въвеждане вход
        String input = scanner.nextLine();
        int countFailed = 0; //брой на неуспешните опити
        while (!input.equals(password)) {
            //ако се въведе вход, който не съвпада -> "Incorrect password. Try again."
            countFailed++;
            if (countFailed == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }

        if (input.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }

    }
}
