import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ShortArrayInEvenOddOrder {

    //5 4 1 3 6 8 9 10
    //Sort this arraylist such as that all odd numbers comes first in a sorted manner (ascending) followed by sorted even numbers.
    // Use comparator to do that.

    public static void main(String[] args) {

        Integer intArray[] = new Integer[]{5, 4, 1, 3, 6, 8, 9, 10};
        List<Integer> integers = Arrays.asList(intArray);

        int ints[] = new int[]{5, 4, 1, 3, 6, 8, 9, 11};
        specialSorting(ints);
        Arrays.sort(ints);
        System.out.println(" ints " + ints);

        List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());

        System.out.println(list);


        System.out.println(integers);
        Collections.sort(integers);

        System.out.println(integers);

        String str[] = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};
        List<String> lst = Arrays.asList(str);
        System.out.println(lst);


        //there is two type of methods we can use

        //seprate even and odd number sorted and mix them
        //make all odd number negative short them and make positive

    }

    public static void specialSorting(int arr[]) {
        int num = arr.length;

        System.out.println("inside method " + Arrays.toString(arr));
        for (int i = 0; i < num; i++) {
            if ((arr[i] & 1) != 0) {
                arr[i] *= -1;
            }
        }

        Arrays.sort(arr);
        System.out.println("after short " + Arrays.toString(arr));
        for (int i = 0; i < num; i++) {
            if ((arr[i] & 1) != 0)

                arr[i] *= -1;
        }
        System.out.println("after 2 short " + Arrays.toString(arr));


    }
}
