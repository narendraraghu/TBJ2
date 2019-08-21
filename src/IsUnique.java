public class IsUnique {
//    Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
//    cannot use additional data structures?

    public static void main(String[] args) {
        IsUnique isUnique = new IsUnique();
        System.out.println(isUnique.fineUniqe("abc"));
    }

    private String fineUniqe(String narendra) {
        char[] arr = narendra.toCharArray();

        for (char c : arr)
        {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==c)
                    return  " unique";

            }
            System.out.println(c);
        }
        return "non unique";

    }
}


//##Todo
