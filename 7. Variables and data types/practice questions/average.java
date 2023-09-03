import java.util.*;
//average of three numbers

public class average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a+b+c)/3;
        System.out.println("Average of three numbers is "+(average));
    }
}
