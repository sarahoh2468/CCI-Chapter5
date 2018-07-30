public class FlipBitToWin {
    /* You have an integer and you can flip exactly one bit from 0 to a 1. Write code to find the
    length of the longest sequence of 1s you could create
     */
    public static int flip(int i) {
        if (~i == 0) {
            return Integer.BYTES * 8;
        }
        int currentLength = 0;
        int previousLength = 0;
        int maxLength = 1;
        while (i != 0) {
            if ((i & 1) == 1) {
                currentLength++;
            }
            else if ((i & 1) == 0) {
                previousLength = (i & 2) == 0 ? 0 : currentLength;
                currentLength = 0;
            }
            maxLength = Math.max(previousLength + currentLength + 1, maxLength);
            i >>>= 1;
        }
        return maxLength;
    }
}
