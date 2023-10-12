// print decreasing numbers from n to 1
public class printdecno {

    public static void printdecno(int n)  {
        if(n == 1) {
            System.out.println(1);
        } else {
            System.out.println(n);
            printdecno(n-1);
        }
    }
    public static void main(String args[]) {
        int n = 10;
        printdecno(n);
    }
}