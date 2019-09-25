import java.util.*;
import java.io.*;

class TimeConvert {
    public static double timeConvert(int number) {

      //  int number = Integer.parseInt(num);
        if (number>=60)
        {
            int hours = number/60;
            double minutes = (number%10)*.01;
            return hours+minutes;

        }
        return 0.01*number;

     // alternative solution if you want to return as Sting
        // return (number / 60 + ":" + number % 60);

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(timeConvert(s.nextInt()));
    }

}


