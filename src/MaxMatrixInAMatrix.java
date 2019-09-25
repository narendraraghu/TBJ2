
import java.util.*;
import java.io.*;
public class MaxMatrixInAMatrix {

    public static int maximalSquare(String[] strArr) {
            int[][] matrix = new int[strArr.length][];
            int index = 0;
            for (String row : strArr) {
                matrix[index++] = Arrays.stream(row.split("(?<=([01]))")).mapToInt(Integer::parseInt).toArray();
            }
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] == 1) {
                        matrix[i][j] = 1 + Arrays.stream(
                                new int[]{matrix[i - 1][j], matrix[i - 1][j - 1], matrix[i][j - 1]})
                                .min().getAsInt();
                    }
                }
            }
            int max = Arrays.stream(matrix).flatMapToInt(Arrays::stream).max().getAsInt();
            return max * max;
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(maximalSquare(new String[] {"0111", "1111", "1101", "1011"}));
        }

    }

