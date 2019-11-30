import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*List of the string is given..from this how to get another list contains
string starts with D or d using some Java 8 API (without any loop)
 */
public class ListOfString {

    public static void main(String[] args) {
        String s1 = "Narendra";
        String s2 = "KT";
        String s3 = "Dev";
        String s4 = "developer";
        String s5 = "Raghu";
        String s6 = "Panku";

        List<String> listOfString = new ArrayList<>();
        listOfString.add(s1);
        listOfString.add(s2);
        listOfString.add(s3);
        listOfString.add(s4);
        listOfString.add(s5);
        listOfString.add(s6);

        System.out.println(listOfString.stream().filter(name->name.startsWith("d")||name.startsWith("D")).collect(Collectors.toList()));
    }
}