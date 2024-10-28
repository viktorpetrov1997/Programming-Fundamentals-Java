package TextProcessing.MoreExercises;

import java.util.HashMap;
import java.util.Scanner;

public class MorseCodeTranslator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        HashMap<String,String> morseCode = new HashMap<>();

        morseCode.put(".-","A");
        morseCode.put("-...","B");
        morseCode.put("-.-.","C");
        morseCode.put("-..","D");
        morseCode.put(".","E");
        morseCode.put("..-.","F");
        morseCode.put("--.","G");
        morseCode.put("....","H");
        morseCode.put("..","I");
        morseCode.put(".---","J");
        morseCode.put("-.-","K");
        morseCode.put(".-..","L");
        morseCode.put("--","M");
        morseCode.put("-.","N");
        morseCode.put("---","O");
        morseCode.put(".--.","P");
        morseCode.put("--.-","Q");
        morseCode.put(".-.","R");
        morseCode.put("...","S");
        morseCode.put("-","T");
        morseCode.put("..-","U");
        morseCode.put("...-","V");
        morseCode.put(".--","W");
        morseCode.put("-..-","X");
        morseCode.put("-.--","Y");
        morseCode.put("--..","Z");

        StringBuilder decryptedMorseCode = new StringBuilder();

        String[] morseCodeText = scanner.nextLine().split(" ");

        for(int i = 0; i < morseCodeText.length; i++)
        {
            String currentMorseCode = morseCodeText[i];
            if(morseCode.containsKey(currentMorseCode))
            {
                decryptedMorseCode.append(morseCode.get(currentMorseCode));
            }
            else
            {
                decryptedMorseCode.append(" ");
            }
        }
        System.out.println(decryptedMorseCode);
    }
}
