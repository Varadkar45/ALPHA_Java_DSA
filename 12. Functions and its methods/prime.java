// To check if the number is prime or not using functions
public class prime {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if(n == 2) {
            return isPrime true;
        }
        for(int i=2; i<=n-1; i++) {
            if(n % i == 0) {
                return isPrime = false;
            }
            
        }
        return isPrime;
    }
    public static void main(String args[]) {
        System.out.println(isPrime(11));
    }
}
