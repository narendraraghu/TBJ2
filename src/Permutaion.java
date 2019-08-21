import java.util.LinkedList;
import java.util.List;

public class Permutaion {

    //Check Permutation: Given two strings, write a method to decide if one is a permutation of the
    //other
    List list = new LinkedList<String>();

    void permutation(String str) {
        permutation(str, "");
    }

    void permutation(String str, String prefix) {
        if (str.length() == 0) {

            list.add(prefix);
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                System.out.println("str.substring(0, i) "+str.substring(0, i));
                System.out.println("str.substring(i+1) "+str.substring( i+1));
                System.out.println("Prefix "+prefix);
                String rem = str.substring(0, i) + str.substring(i + 1);

                permutation(rem, prefix + str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Permutaion permutaion = new Permutaion();
        permutaion.permutation("ab");

        System.out.println(permutaion.checkEquality("nare"));
    }

    private boolean checkEquality(String abc) {
        if (list.contains(abc))
            return true;
        return false;

    }
}