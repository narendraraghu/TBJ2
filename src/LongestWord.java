import java.util.*;
//Find the longest word in give sting "I love You" -> love
class LongestWord {

    public static String longestWord(String sen) {

        String[] words = sen.toLowerCase().split("[^A-Za-z0-9]");
        System.out.println(words);
        int maxIndex = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > words[maxIndex].length()) {
                maxIndex = i;
            }
        }
        return words[maxIndex];

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(longestWord(s.nextLine()));
    }

}


  