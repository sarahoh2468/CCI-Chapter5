public class BinaryToString {
    // Given a real number between 0 and 1, print the binary representation
    public static String binToString(double i) {
        if (i <= 0 || i >= 1) {
            return "ERROR";
        }

        StringBuilder binary = new StringBuilder();
        binary.append(".");
        while (i > 0) {
            if (binary.length() >= 32) {
                return "ERROR";
            }

            double r = i*2;
            if (r >= 1) {
                binary.append(1);
                i = r - 1;
            }
            else {
                binary.append(0);
                i = r;
            }
        }
        return binary.toString();
    }
}
