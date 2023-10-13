public class optimizedpowern {
    public static int optimizePower(int a, int n) {
        if(n == 0) {
            return 1;
        }
        //int halfPowerSq = optimizePower(a, n/2) * optimizePower(a, n/2);
        /*Using the above step tc would be still O(n) because optimizePower(a, n/2) is unecessarily getting called 2 times instead we would store it in a variable and take its square*/
        int halfPower = optimizePower(a, n/2);
        int halfPowerSq = halfPower*halfPower;
        if(n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String args[]) {
        int a = 2;
        int n = 5;
        System.out.println(optimizePower(a, n));
    }
    
}
