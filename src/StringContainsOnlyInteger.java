import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringContainsOnlyInteger {


    public static void main(String args[]) {

        generateMacAddress(5);
        // Regular expression pattern to test input
        String regex = "(.)*(\\d)(.)*";
        Pattern pattern = Pattern.compile(regex);

        Scanner reader = new Scanner(System.in);
        String input = "test bAAA";

        System.out.println(StringUtils.capitalize(input));


        System.out.println("Please enter input, must contain at-least one digit");

        while (!input.equalsIgnoreCase("EXIT")) {

            input = reader.nextLine();

            // Pattern pattern = Pattern.compile(regex);  // Don't do this, creating Pattern is expensive
            Matcher matcher = pattern.matcher(input);

            boolean isMatched = matcher.matches();
            if (isMatched) {
                System.out.println("PASS");

            } else {
                System.out.println("FAIL, Incorrect input");

            }
        }
    }


    public static void generateMacAddress(int n) {

        for (int j = 0; j < n; j++) {


        String[] Mac = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        Random rd = new Random();
        rd.nextInt(15);
        String result = "";

        for (int i = 0; i < 6; i++) {
            String a = Mac[rd.nextInt(15)];
            String b = Mac[rd.nextInt(15)];
          //  System.out.println("a  "+ a+  " b "+b);
            result += a + b;
            if (i < 5) {
                result += ":";
            }
        }

        System.out.println(result);
    }
    }
}

