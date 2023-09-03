public class printreversenum {
    public static void main(String args[]) {
        int n = 45678;
        int rev = 0;


        while(n > 0) {
            int lastdigit = n % 10;
            rev = (rev*10) + lastdigit; //logic for reversing the digits
            n = n / 10; // n is updated 
        }
        System.out.println(rev);
    }
    
}
