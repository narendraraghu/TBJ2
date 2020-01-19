class PrintallSubarrays {
    // Function to print all sub-arrays with 0 sum present
    // in the given array
    public int solution(int[] A) {
        int currSum = A[0];
        int start = 0;
        int end = 0;
        int count = 0;
        if (A.length >= 100000) {
            return -1;
        }

        while (end < A.length) {
            if (currSum == 0) {
                //System.out.println("Found given sum from " + start + " to " + end);
                ++count;
            }
            if (currSum <= 0) {
                end++;
                if (end < A.length)
                    currSum = currSum + A[end];
            } else {
                currSum = currSum - A[start];
                start++;
            }
        }
        return count;

    }

    // main function
    public static void main(String[] args) {
        int[] A = {2, -2, 3, 0, 3, 4, -7};

        System.out.println(new PrintallSubarrays().solution(A));
    }
}