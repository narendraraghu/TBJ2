import java.time.LocalDate;
import java.util.Date;
import java.util.stream.Stream;

public class StringReverseUsingNby2Complexity {

    public static void main(String[] args) {
        char temp;
        char[] strRev =  "ABCD".toCharArray();

        int len = strRev.length;
        for(int i=0;i < len/2;i++){
            temp = strRev[i];
            strRev[i] = strRev[len-i-1];
            strRev[len-i-1] = temp;
        }
        System.out.println(strRev);
    }
}
