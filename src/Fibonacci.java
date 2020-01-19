public class Fibonacci {
    public static void main(String[] args) {
        int range = 10;
        new Fibonacci().fib(range);
    }

    public void fib(int number) {
        int firstValue = 0;
        int secondValue = 1;
        int sum = 0;
        for (int i = 1; i <= number; ++i) {
            System.out.println(firstValue);
            sum = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = sum;
        }
    }
}
