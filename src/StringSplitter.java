import java.util.*;
import java.util.stream.Collectors;

public class StringSplitter {
    public static void main(String[] args) {
        String s = "Narendra Raghuwanshi";
        String words[] = s.split(" ");
        System.out.println(words.length);

        for (String s1 : words) {
            System.out.println(s1);
        }
        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123","555-3389"));
        people.put("Narendra",Arrays.asList("555-1113","555-3689"));
        people.put("Sunandan",Arrays.asList("555-9123","555-3589"));

        List<String> phones = people.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(phones);
    }
}
