import java.util.*;
public class switchcalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.next().charAt(0);//here charat is used to take only the character at oth position
        switch(operator) {
            case '+' :
            System.out.println("Addition is "+(a+b));
                break;
            case '-' :
            System.out.println("Subtraction is "+(a-b));
                break;
            case '*' :
            System.out.println("Multiplication is "+(a*b));
                break;
            case '/' :
            System.out.println("Division is "+(a/b));
                break;
            case '%' :
            System.out.println("After division remainder is "+(a+b));
                break;
            default :
            System.out.println("Not valid operation");
        }
    }    
}
