public class BitwiseOperatorDemo {

    public static void main(String[] args) {

        int a = 42;
        int b = -6;
        System.out.print(a + ": ");
        showBits(a);
        System.out.print(b + ": ");
        showBits(b);
        System.out.print("AND (a & b): ");
        showBits(a & b);
        System.out.print("OR (a | b): ");
        showBits(a | b);
        System.out.print("Ex-OR (a ^ b): ");
        showBits(a ^ b);
        System.out.print("left-shift (a << 2): ");
        showBits(a << 2);
        System.out.print("signed right-shift (a >> 2): ");
        showBits(a >> 2);
        System.out.print("right-shift (a >>> 2): ");
        showBits(a >>> 2);
        System.out.print("Complement (~a): ");
        showBits(~a);

    }

    public static void showBits(int param) {
        int mask = 1 << 31;

        for (int i = 1; i <= 32; i++, param <<= 1) {
            System.out.print((param & mask) == 0 ? "0" : "1");
            if (i % 8 == 0)
                System.out.print(" ");
        }
        System.out.println();
    }
}