package RegularExpressions.Exercises;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] racers = scanner.nextLine().split(", ");

        LinkedHashMap<String, Integer> racersDistances = new LinkedHashMap<>();

        for(String racer : racers)
        {
            racersDistances.put(racer,0);
        }

        String regexLetters = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexLetters);

        String regexDigit = "[0-9]";
        Pattern patternDigits = Pattern.compile(regexDigit);

        String input = scanner.nextLine();
        while(!input.equals("end of race"))
        {

            StringBuilder name = new StringBuilder();
            Matcher matcherName = patternLetters.matcher(input);

            while(matcherName.find())
            {
                name.append(matcherName.group());
            }

            int distance = 0;
            Matcher matcherDigits = patternDigits.matcher(input);

            while(matcherDigits.find())
            {
                distance += Integer.parseInt(matcherDigits.group());
            }


            String racerName = name.toString();
            if(racersDistances.containsKey(racerName))
            {
                racersDistances.put(racerName, racersDistances.get(racerName) + distance);
            }
            input = scanner.nextLine();
        }

        List<String> firstThreeRacers = new ArrayList<>();
        racersDistances.entrySet().stream()
                .limit(3)
                .forEach(racer -> {
                    firstThreeRacers.add(racer.getKey());
                });

        System.out.println("1st place: " + firstThreeRacers.get(0));
        System.out.println("2nd place: " + firstThreeRacers.get(1));
        System.out.println("3rd place: " + firstThreeRacers.get(2));
    }
}
