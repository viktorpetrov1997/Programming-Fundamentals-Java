package RegularExpressions.Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] demons = scanner.nextLine().split(", *");

        String healthRegex = "[^\\-0-9\\+\\*\\/\\.]*";
        String baseDamageRegex = "[\\-\\+]?([0-9]+)[.]?[0-9]*";
        String symbolsForBaseDamage = "[\\/\\*]";

        for(int i = 0; i < demons.length; i++)
        {
            String currentDemon = demons[i].replaceAll(" ","");
            Pattern pattern = Pattern.compile(healthRegex);
            Matcher matcher = pattern.matcher(currentDemon);

            StringBuilder healthString = new StringBuilder();
            int health = 0;

            while(matcher.find())
            {
                healthString.append(matcher.group());
            }

            for(int j = 0; j < healthString.length(); j++)
            {
                 health += healthString.charAt(j);
            }

            pattern = Pattern.compile(baseDamageRegex);
            matcher = pattern.matcher(currentDemon);
            double damage = 0.0;

            while(matcher.find())
            {
                String group = matcher.group();
                String sign = "" + group.charAt(0);
                if(sign.equals("+"))
                {
                    damage += Double.parseDouble(group.substring(1));
                }
                else if(sign.equals("-"))
                {
                    damage -= Double.parseDouble(group.substring(1));
                }
                else
                {
                    damage += Double.parseDouble(group);
                }
            }

            pattern = Pattern.compile(symbolsForBaseDamage);
            matcher = pattern.matcher(currentDemon);
            while(matcher.find())
            {
                if(matcher.group().equals("*"))
                {
                    damage *= 2;
                }
                else
                {
                    damage /= 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n",currentDemon,health,damage);
        }
    }
}
