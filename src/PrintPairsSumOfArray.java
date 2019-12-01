public class PrintPairsSumOfArray {


    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
        prettyPrint(arr, 7);
    }

    private static void prettyPrint(int[] arr, int sum) {

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            for (int j = i+1; j <arr.length ; j++) {
                int b = arr[j];

                if(a+b==sum)
                    System.out.println("["+a+","+b+"]");

            }
        }

    }
}
