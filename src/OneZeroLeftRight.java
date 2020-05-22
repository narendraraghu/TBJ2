import java.util.Arrays;

public class OneZeroLeftRight {

    public static void main(String[] args) {

        int array[]= {0,1,1,0,0,1,0,0,1};
        int lastIndexValue=array.length-1;
        int newArray[]= new int[array.length];

        for(int i=0;i<array.length;i++) {

            if(array[i]==1) {
                newArray[lastIndexValue]=1;
                lastIndexValue--;
            }
        }

        System.out.println(Arrays.toString(newArray));
    }
}
/*

A Difficult way of doing the same :P
public static void main(String[] args) {
        int arr[] ={1,0,1,1,1,0,0,0,0};

        int low =0;
        int high = arr.length-1;

        while (low<high)
        {
            while (low<high && arr[low]==0)
                low++;

            while (low<high&& 1 == arr[high]) {
                high--;
            }
            if(low<high)
            {
                arr[low]=0;
                arr[high]=1;
                low++;
                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
*/
