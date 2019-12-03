import java.util.*;
class LetterCapitalize {
    public static String firstLetterCapitalize(String str) {

        StringBuilder sb = new StringBuilder();
        for (String word : str.toLowerCase().split("\\s")) {
            char firstLetter = word.substring(0, 1).charAt(0);
            sb.append(firstLetter >= 'a' && firstLetter <= 'z' ? (char)(firstLetter - 32) : firstLetter).append(word.substring(1)).append(" ");
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(firstLetterCapitalize(s.nextLine()));
    }
}


