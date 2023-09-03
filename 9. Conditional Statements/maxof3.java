import java.util.*;
public class maxof3 {
    public static void main(String args[]) {
        int a = 75;
        int b = 30;
        int c = 69;
        if( (a>=b) &&(a>=c) ) {
            System.out.println("A is the largest Number "+a);
        }
        else if(b>=c){
            System.out.println("B is the largest Number "+b);
        }
        else{
            System.out.println("C is the largest Number "+c);
        }
    }
}
