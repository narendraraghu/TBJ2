import java.util.*;
import java.io.*;

class PentagonalNumber {

    static int count = 0;

    public static int pentagonalNumber(int num) {

        if (num == 1) {
            return 1;
        }
        return ((num - 1) * 5) + pentagonalNumber(num - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(pentagonalNumber(4));
    }

}


  