public class Conversion {
    /* Write a function to determine the number of bits you would need to flip to convert integer A
       integer A to integer B
    */
    public static void main(String[] args) {
        int a = 29;
        int b = 15;
        int result = conversion(a, b);
        System.out.println(result);
    }
    public static int conversion(int a, int b) {
        int result = a ^ b;
        int count = 0;
        while (result != 0) {
            if ((result & 1) == 1) {
                count++;
            }
            result = result >> 1;
        }
        return count;
    }
}
