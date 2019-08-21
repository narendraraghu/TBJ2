import java.util.Stack;
import java.util.StringTokenizer;

public class URLify {

    public static void main(String[] args) {
        URLify urLify = new URLify();
        urLify.convertToURL("Mr John Smith   ");
    }

    private void convertToURL(String str) {

        String sh = "HowToDoInJava.com";
        System.out.println(sh + " -> " + new StringBuilder(sh).reverse( ));

        String s = "Java technology blog for smart java concepts and coding practices";

// Put words from String in Stack


        Stack<String> myStack = new Stack<>();
        StringTokenizer st = new StringTokenizer(s, " ");

        while (st.hasMoreTokens()) {
            myStack.push(st.nextToken());
        }

// Build the reverse string
        StringBuilder reverseString = new StringBuilder();
        while (!myStack.empty()) {
            reverseString.append(myStack.pop() + " ");
        }

        System.out.println(reverseString.toString());
    }

    }

