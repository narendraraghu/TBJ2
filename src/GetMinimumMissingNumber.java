/*that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A. For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.*/

import java.util.Arrays;

public class GetMinimumMissingNumber {

    private void getMinimumNumberMethod(int[] arr)
    {
        Arrays.stream(arr).forEach(System.out::println);
    }
    public static void main(String[] args) {
        GetMinimumMissingNumber getMinimumMissingNumber = new GetMinimumMissingNumber();
        int[] arr ={1,2,3,4,6};
        getMinimumMissingNumber.getMinimumNumberMethod(arr);
    }
 }
