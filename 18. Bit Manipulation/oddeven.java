/* To check if a number is even or odd */
public class oddeven {
    public static void oddorEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("Even Number");
        } else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String args[]) {
        oddorEven(3);
        oddorEven(14);
        oddorEven(19);
    }
}
