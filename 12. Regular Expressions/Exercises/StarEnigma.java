package RegularExpressions.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<StringBuilder> decryptedMessageList = new ArrayList<>();
        int countLetters = 0;

        for(int i = 0; i < n; i++)
        {
            String text = scanner.nextLine();
            for (int j = 0; j < text.length(); j++)
            {
                char currentChar = text.charAt(j);
                if(Character.toLowerCase(currentChar) == 's' || Character.toLowerCase(currentChar) == 't'
                        || Character.toLowerCase(currentChar) == 'a' || Character.toLowerCase(currentChar) == 'r')
                {
                    ++countLetters;
                }
            }

            StringBuilder decryptedMessage = new StringBuilder();

            for(int j = 0; j < text.length(); j++)
            {
                char newChar = (char) (text.charAt(j) - countLetters);
                decryptedMessage.append(newChar);
            }

            decryptedMessageList.add(decryptedMessage);
            countLetters = 0;
        }

        String regex = "@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attack>[AD])![^@!:>-]*->(?<soldierCount>[0-9]+)";

        Pattern pattern = Pattern.compile(regex);

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for(int i = 0; i < decryptedMessageList.size(); i++)
        {
            Matcher matcher = pattern.matcher(decryptedMessageList.get(i));
            if(matcher.find())
            {
                String planetName = matcher.group("planetName");
                String attackType = matcher.group("attack");

                if(attackType.equals("A"))
                {
                    attackedPlanets.add(planetName);
                }
                else
                {
                    destroyedPlanets.add(planetName);
                }
            }
        }

        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);

        System.out.println("Attacked planets: " + attackedPlanets.size());
        attackedPlanets.forEach(planet -> System.out.println("-> " + planet));

        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));
    }
}
