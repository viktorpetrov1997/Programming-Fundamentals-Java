package ExamPreparation.ExamPreparationTwo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> heroHP = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> heroMP = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < n; i++)
        {
            String[] heroesInfo = scanner.nextLine().split(" ");
            String name = heroesInfo[0];
            int HP = Integer.parseInt(heroesInfo[1]);
            int MP = Integer.parseInt(heroesInfo[2]);

            heroHP.putIfAbsent(name,0);
            heroMP.putIfAbsent(name,0);

            if(heroHP.get(name) + HP > 100)
            {
                heroHP.put(name,100);
            }
            else
            {
                heroHP.put(name, heroHP.get(name) + HP);
            }

            if(heroMP.get(name) + MP > 200)
            {
                heroMP.put(name,200);
            }
            else
            {
                heroMP.put(name, heroMP.get(name) + MP);
            }
        }

        String input = scanner.nextLine();
        while(!input.equals("End"))
        {
            String[] commandArray = input.split(" - ");
            String command = commandArray[0];
            String heroName = commandArray[1];

            if(command.equals("CastSpell"))
            {
                int MP = Integer.parseInt(commandArray[2]);
                String spellName = commandArray[3];

                if(heroMP.get(heroName) >= MP)
                {
                    heroMP.put(heroName, heroMP.get(heroName) - MP);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n",heroName,spellName,
                                      heroMP.get(heroName));
                }
                else
                {
                    System.out.printf("%s does not have enough MP to cast %s!%n",heroName,spellName);
                }
            }
            else if(command.equals("TakeDamage"))
            {
                int damage = Integer.parseInt(commandArray[2]);
                String attacker = commandArray[3];

                if(heroHP.get(heroName) - damage > 0)
                {
                    heroHP.put(heroName, heroHP.get(heroName) - damage);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",heroName,damage,
                                      attacker,heroHP.get(heroName));
                }
                else
                {
                    System.out.printf("%s has been killed by %s!%n",heroName,attacker);
                    heroHP.remove(heroName);
                    heroMP.remove(heroName);
                }
            }
            else if(command.equals("Recharge"))
            {
                int MP = Integer.parseInt(commandArray[2]);

                if(heroMP.get(heroName) + MP > 200)
                {
                    int difference = 200 - heroMP.get(heroName);
                    heroMP.put(heroName,200);
                    System.out.printf("%s recharged for %d MP!%n",heroName,difference);
                }
                else
                {
                    heroMP.put(heroName, heroMP.get(heroName) + MP);
                    System.out.printf("%s recharged for %d MP!%n",heroName,MP);
                }
            }
            else if(command.equals("Heal"))
            {
                int HP = Integer.parseInt(commandArray[2]);

                if(heroHP.get(heroName) + HP > 100)
                {
                    int difference = 100 - heroHP.get(heroName);
                    heroHP.put(heroName,100);
                    System.out.printf("%s healed for %d HP!%n",heroName,difference);
                }
                else
                {
                    heroHP.put(heroName, heroHP.get(heroName) + HP);
                    System.out.printf("%s healed for %d HP!%n",heroName,HP);
                }
            }
            input = scanner.nextLine();
        }

        for(Map.Entry<String, Integer> entry : heroHP.entrySet())
        {
            System.out.println(entry.getKey());
            System.out.printf("  HP: %d%n",entry.getValue());
            System.out.printf("  MP: %d%n",heroMP.get(entry.getKey()));
        }
    }
}
