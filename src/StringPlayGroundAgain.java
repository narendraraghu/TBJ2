import java.util.regex.Pattern;

public class StringPlayGroundAgain {



    public static void main(String[] args) {

        countPantuation();
        countVowelsAndConstants();
        anagram();
        stringRotation();
    }

    private static void stringRotation() {
        String str1 = "abcde", str2 = "deabc";

        if(str1.length() != str2.length()){
            System.out.println("Second string is not a rotation of first string");
        }
        else {
            //Concatenate str1 with str1 and store it in str1
            str1 = str1.concat(str1);
            System.out.println(str1);

            //Check whether str2 is present in str1
            if(str1.indexOf(str2) != -1)
                System.out.println("Second string is a rotation of first string");
            else
                System.out.println("Second string is not a rotation of first string");
        }
    }

    private static void anagram() {
        String str1 ="NAN";
        String str2 ="NPN";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        if (str1.length()!=str2.length())
            System.out.println("Length must be equal fo anagram");
        else
        {
        for (int i = 0; i < str1.length(); i++) {
            if(arr1[i]!=arr2[str1.length()-1])
                break;
            System.out.println(" anagram");
        }
            System.out.println("Not anagram");
        }

    }

    private static void countVowelsAndConstants() {
        String str = "This is a really simple sentence";
         int countVowels=0;
        int countConstant=0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
                countVowels++;
            }
            else {
                countConstant++;
            }
        }

        System.out.println("countVowels "+countVowels+" countConstant "+countConstant);


    }

    private static void countPantuation() {
        String str = "Good Morning! Mr. James Potter. Had your breakfast?";
          int countPuncMarks=0;
        //Find total number of pantuation
        //If any character in the string is matched with ('!', "," ,"\'" ,";" ,"\"", ".", "-" ,"?"), increment the count by 1.
        for (int i = 0; i < str.length(); i++) {
            //Checks whether given character is punctuation mark
            if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '-' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {
                countPuncMarks++;
            }
        }

        System.out.println(countPuncMarks);
    }
}


