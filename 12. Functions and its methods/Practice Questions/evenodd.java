import java.util.*;
public class evenodd {
    public static boolean isEven(int n) {
        if(n % 2 == 0) {
            return true;
        }
        else{
            return false;
        }
        
    }    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int n = sc.nextInt();
        boolean cls = isEven(n);
        System.out.println(n + " is even : "+cls);
    }
}
