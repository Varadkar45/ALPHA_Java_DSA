public class clearlastibits {
    public static int clearibits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String args[]) {
        System.out.println(clearibits(15, 2));
    }
    
}
