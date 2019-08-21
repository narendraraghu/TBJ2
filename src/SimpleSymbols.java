//Have the function SimpleSymbols(str) take the str parameter being passed and determine if it is an acceptable sequence by either returning the string true or false. The str parameter will be composed of + and = symbols with several characters between them (ie. ++d+===+c++==a) and for the string to be true each letter must be surrounded by a + symbol. So the string to the left would be false. The string will not be empty and will have at least one letter.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleSymbols {
  public static String simpleSymbols (String str){
            int patternCount = 0;
            Matcher patternMatch = Pattern.compile("(?=(\\+[a-z]\\+))").matcher(str.toLowerCase());
            while (patternMatch.find()) {
                patternCount++;
            }
            int letterCount = 0;
            Matcher letterMatch = Pattern.compile("[a-z]").matcher(str.toLowerCase());
            while (letterMatch.find()) {
                letterCount++;
            }
            return String.valueOf(letterCount == patternCount);
        }

        public static void main (String[] args){
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(simpleSymbols(s.nextLine()));
        }

    }
