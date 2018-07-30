public class Insertion {
    // Write a method to insert M into N
    public static int insertion(int N, int M, int i, int j) {
        int left = (~0) << (j + 1);
        int right = ~((~0) << i);
        int mask = left | right;
        int result = N & mask;
        result = result | (M << i);
        return result;
    }
}
