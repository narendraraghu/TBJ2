import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorSequentialIteration
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("Rams");
        names.add("Posa");
        names.add("Chinni");

        // Getting Spliterator
        Spliterator<String> namesSpliterator = names.spliterator();

        // Traversing elements
        namesSpliterator.forEachRemaining(System.out::println);
    }
}