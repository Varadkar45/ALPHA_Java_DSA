public class sumfirstn {
    public static int calcSum(int n) {
        if(n==1) {
            return 1;
        }
        int sumnm1 = calcSum(n-1);
        int sum = n + sumnm1;
        return sum;

    }
    public static void main(String args[]) {
        int n = 10;
        System.out.println(calcSum(n));
    }
    
}
