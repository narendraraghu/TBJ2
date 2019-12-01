public class CheckStringRotation {
    public static void main(String[] args) {
        System.out.println(checkRotatation("hellohi","hihello"));
    }

        public static boolean checkRotatation(String original, String rotation) {
            if (original.length() != rotation.length()) {
                return false;
            }

            String concatenated = original + original;

            return concatenated.contains(rotation);
        }

}
