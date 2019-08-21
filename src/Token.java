import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;
import java.io.*;
import java.util.Stack;

class Token {
    public static String FirstReverse(String str) {

        // code goes here
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */

      Stack<String> stringStack = new Stack<>();


        StringTokenizer st = new StringTokenizer(str," ");
        System.out.println(st.countTokens());

        while (st.hasMoreTokens())
            stringStack.push(st.nextToken());

        System.out.println(stringStack.stream().count());

        StringBuilder sb = new StringBuilder(str);
        while (!stringStack.empty()) {
            sb.reverse().append(stringStack.pop() + " ");
        }

        return sb.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

}


  