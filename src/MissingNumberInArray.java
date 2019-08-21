import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.LongStream;

public class MissingNumberInArray {

    public static void main(String[] args) {

        int total =10;
        int arr[] ={1,2,3,4,6,7,8,9,10};
        int sum = Arrays.stream(arr).sum();


        int idealSum = (total*(total+1))/2;
        System.out.println("Missing Number " +(idealSum-sum));
        System.out.println(factoria(idealSum-sum));


        Integer[] array = {1,2,3,4,4,5,5,6,7,8};  //input 1
        int size = array.length;              //input 2

        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> duplicates = new HashSet<Integer>();

        for(int i = 0; i < size ; i++)
        {
            if(set.add(array[i]) == false)
            {
                duplicates.add(array[i]);
            }
        }

        if(duplicates.size() == 0)
        {
            duplicates.add(0);
        }

        System.out.println(duplicates);
    }



    static int factoria(int n)
    {
        return n == 1 ? 1 : n * factoria( n-1 );
    }



}
