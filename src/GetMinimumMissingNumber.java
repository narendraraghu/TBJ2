/*that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A. For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class GetMinimumMissingNumber {

    private void getMinimumNumberMethod(int[] arr)
    {
        int sum = Arrays.stream(arr).sum();
        int sumOfN = IntStream.range(1,7).sum();
        System.out.println(sumOfN);
        System.out.println(sum);
        System.out.println(sumOfN-sum);
        //.forEach(System.out::println);
    }
    public static void main(String[] args) {
        GetMinimumMissingNumber getMinimumMissingNumber = new GetMinimumMissingNumber();
        int[] arr ={1,2,3,4,6};
        getMinimumMissingNumber.getMinimumNumberMethod(arr);
    }
 }
