import java.util.Arrays;
import java.util.StringTokenizer;

public class SortString {

    public static String alphabetSoup(String str) {
//
//        This is the wrong implementation for sorting the character this is solution for revers a string
//        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
//         StringBuilder stringBuilder = new StringBuilder();
//        while (stringTokenizer.hasMoreTokens())
//       {
//           stringBuilder.append(stringTokenizer.nextToken());
//
//       }
//
//        stringBuilder.reverse();
//        return stringBuilder.toString();
//    }

        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public static void main(String[] args) {
        // keep this function call here
        System.out.print(alphabetSoup("quack"));
    }
}

