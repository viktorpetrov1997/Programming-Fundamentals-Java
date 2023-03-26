package AssociativeArrays.MoreExercises;

import java.util.*;

public class Snowwhite
{
    public static void main(String[] args)
    {
        Map<String, Integer> dwarfs = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Once upon a time"))
        {
            String[] inputArr = inputLine.split(" <:> ");
            String hairColor = inputArr[1];
            String name = inputArr[0];
            int physics = Integer.parseInt(inputArr[2]);

            String key = String.format("(%s) %s", hairColor, name);

            dwarfs.putIfAbsent(key, 0);

            if (dwarfs.get(key) < physics)
            {
                dwarfs.put(key, physics);
            }

            inputLine = scanner.nextLine();
        }

        Map<String, Integer> hatColorsCount = new HashMap<>();
        for (String key : dwarfs.keySet())
        {
            String hatColor = key.split("\\) ")[0].substring(1);
            hatColorsCount.put(hatColor, hatColorsCount.getOrDefault(hatColor, 0) + 1);
        }

        dwarfs.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing((a, b) -> {
                            String colorA = a.getKey().split("\\) ")[0].substring(1);
                            String colorB = b.getKey().split("\\) ")[0].substring(1);
                            return Integer.compare(hatColorsCount.get(colorB), hatColorsCount.get(colorA));
                        }))
                .forEach(e -> System.out.printf("%s <-> %d%n", e.getKey(), e.getValue()));
    }
}