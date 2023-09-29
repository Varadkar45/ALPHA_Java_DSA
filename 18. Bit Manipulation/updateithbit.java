public class updateithbit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int setIthBit(int n , int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int updateIthBit(int n, int i,int newBit) {
        /*if(newBit == 0) {
            return clearIthBit(n, i);
        } else{
            return setIthBit(n, i);
        }
        */

        n = clearIthBit(n,1);
        int Bitmask = newBit<<1;
        return n | Bitmask;
    }
    public static void main(String args[]) {
        System.out.println(updateIthBit(10,2,1));
    }    
}
