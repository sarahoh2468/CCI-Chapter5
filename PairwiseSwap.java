public class PairwiseSwap {
    /* Write a program to swap odd and even bits in an integer with as few instructions as possible
     */
    public static int swap(int n) {
        int odd = (n & 0xaaaaaaaa) >> 1;
        int even = (n & 0x55555555) << 1;
        return odd | even;
        }
    }
    
}
