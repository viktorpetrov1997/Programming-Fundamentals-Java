package AssociativeArrays;

import java.util.*;

public class OddOccurrences
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        LinkedHashMap<String,Integer> wordsMap = new LinkedHashMap<>();

        for(String word : words)
        {
            String wordInLowerCase = word.toLowerCase();
            wordsMap.putIfAbsent(wordInLowerCase,0);
            wordsMap.put(wordInLowerCase,wordsMap.get(wordInLowerCase) + 1);
        }

        List<String> odds = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet())
        {
            if(entry.getValue() % 2 != 0)
            {
                odds.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ",odds));
    }
}
