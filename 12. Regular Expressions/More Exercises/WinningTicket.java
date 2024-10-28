package RegularExpressions.MoreExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String regex = "[@]{6,}|[$]{6,}|[#]{6,}|[\\^]{6,}";
        Pattern pattern = Pattern.compile(regex);

        String[] tickets = scanner.nextLine().split("[, ]+");

        for(int i = 0; i < tickets.length; i++)
        {
            if(tickets[i].length() == 20)
            {
                String currentTicket = tickets[i];
                String left = currentTicket.substring(0,10);
                String right = currentTicket.substring(10,20);
                String leftMatch = "a";
                String rightMatch = "s";

                Matcher leftMatcher = pattern.matcher(left);
                Matcher rightMatcher = pattern.matcher(right);

                if(leftMatcher.find())
                {
                    leftMatch = leftMatcher.group();
                }

                if(rightMatcher.find())
                {
                    rightMatch = rightMatcher.group();
                }

                if(leftMatch.substring(0,1).equals(rightMatch.substring(0,1)))
                {
                    int matchCount = Math.min(leftMatch.length(),rightMatch.length());
                    if(matchCount == 10)
                    {
                        System.out.printf("ticket \"%s\" - 10%s Jackpot!%n",currentTicket,leftMatch.substring(0,1));
                    }
                    else
                    {
                        System.out.printf("ticket \"%s\" - %d%s%n",currentTicket,matchCount
                                          ,leftMatch.substring(0,1));
                    }
                }
                else
                {
                    System.out.printf("ticket \"%s\" - no match%n",currentTicket);
                }
            }
            else
            {
                System.out.println("invalid ticket");
            }
        }
    }
}
