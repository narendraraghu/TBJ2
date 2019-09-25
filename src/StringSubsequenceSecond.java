public class StringSubsequenceSecond {
    //Input: str1 = "AXY", str2 = "ADXCPY"
    //Output: True (str1 is a subsequence of str2)

    static boolean isSubSequence(char str1[], char str2[], int m, int n)
    {
        int j = 0; // For index of str1 (or subsequence

        // Traverse str2 and str1, and compare current character
        // of str2 with first unmatched char of str1, if matched
        // then move ahead in str1
        for (int i=0; i<n&&j<m; i++)
            if (str1[j] == str2[i])
                j++;

        // If all characters of str1 were found in str2
        return (j==m);
    }


    public static void main(String[] args) {
        char[] str1Array = "NAR".toCharArray();
        char[] str2Array = "NARENDRA".toCharArray();
        System.out.println( isSubSequence(str1Array, str2Array,str1Array.length,str2Array.length));
    }

//one more cool method
static boolean isSubSequence(String str1, String str2, int m, int n)
{
    // Base Cases
    if (m == 0)
        return true;
    if (n == 0)
        return false;

    // If last characters of two strings are matching
    if (str1.charAt(m-1) == str2.charAt(n-1))
        return isSubSequence(str1, str2, m-1, n-1);

    // If last characters are not matching
    return isSubSequence(str1, str2, m, n-1);
}
}
