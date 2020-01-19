//Find pair with given sum in the array

public class SumOf {

    public static void main(String[] args) {

        int array[]={8,7,2,5,3,1};
        int sum = 10;
        System.out.printf("Sum  "+countPair(array,sum));

    }

    private static int countPair(int[] array,int sum) {

        int count =0;
        if(array.length==0)
            return 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if (array[i]+array[j]==10)
                    System.out.printf("i = %d and j = %d ",array[i], array[j]);
            }
        }
        return count;
    }
}
