public class countsetbitsinanumber {
    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            if((n&1) != 0) {// check our LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    } 
    public static void main(String args[]) {
        System.out.println(countSetBits(10));
        System.out.println(countSetBits(15));
        System.out.println(countSetBits(16));
    }
    
}
