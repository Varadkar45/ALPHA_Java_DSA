import java.util.*;
public class reversenum {
    public static void main(String args[]) {
        int n = 413252;
        while(n>0){
            int lastdigit = n % 10; // takes the last digit as when divided by 10 
            System.out.print(lastdigit);
            n = n/10;//when the no. is divided by 10 it eliminates the last digit and further the number is reversed
        }
    }
}
