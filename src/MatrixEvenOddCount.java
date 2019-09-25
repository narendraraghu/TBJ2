public class MatrixEvenOddCount {
    public static void main(String[] args) {
        int rows, cols, countOdd = 0, countEven = 0;
        int a[][] = {
                {1, 2, 3},
                {8, 6, 4}
        };

        //Calculates number of rows and columns present in given matrix
        rows = a.length;
         cols = a[0].length;
        System.out.println("rows "+rows+" cols "+cols);

        //Counts the number of even elements and odd elements
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(a[i][j] % 2 == 0)
                    countEven++;
                else
                    countOdd++;
            }
        }

        System.out.println("countEven "+countEven+" countOdd "+countOdd);
    }
}
