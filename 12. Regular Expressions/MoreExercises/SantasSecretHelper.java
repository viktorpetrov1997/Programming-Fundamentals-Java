package RegularExpressions.MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantasSecretHelper
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String regex = "@(?<name>[A-Za-z]+)[^\\@\\-\\!\\:\\>]*!(?<behaviour>[G N])!";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scanner.nextLine());

        List<StringBuilder> decryptedMessages = new ArrayList<>();

        String input = scanner.nextLine();
        while(!input.equals("end"))
        {
            String encryptedMessage = input;

            StringBuilder decryptedMessage = new StringBuilder();
            for(int j = 0; j < encryptedMessage.length(); j++)
            {
                char newChar = (char) (encryptedMessage.charAt(j) - n);
                decryptedMessage.append(newChar);
            }
            decryptedMessages.add(decryptedMessage);
            decryptedMessage =  new StringBuilder();

            input = scanner.nextLine();
        }

        for(int i = 0; i < decryptedMessages.size(); i++)
        {
            StringBuilder currentKid = decryptedMessages.get(i);
            Matcher matcher = pattern.matcher(currentKid);

            if(matcher.find())
            {
                String name = matcher.group("name");
                String behaviour = matcher.group("behaviour");

                if(behaviour.equals("G"))
                {
                    System.out.println(name);
                }
            }
        }
    }
}
