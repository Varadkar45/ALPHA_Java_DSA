import java.util.*;
public class averagenum {
    public static void averagenum(double num1, double num2, double num3) {
        double averagenum = (num1+num2+num3)/3;
        System.out.println("The Average of three numbers "+num1+" "+num2+" "+num3+"  is "+averagenum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        averagenum(num1, num2, num3);

    }
}
