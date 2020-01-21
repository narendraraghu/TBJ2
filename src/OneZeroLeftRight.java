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
