import java.util.*;
public class implicitconversion {
    public static void main(String args[]) {
        
        int a = 25;
        long b = a;//if reverse conversion then it will throw a error of lossy compression
        System.out.println(a);
        
        /*
        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();// not possible reverse for float->int
        System.out.println(a)
        */
    }
}
