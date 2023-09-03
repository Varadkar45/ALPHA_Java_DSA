import java.util.*;
//Area of square using input from user
public class areasquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = (side*side);
        System.out.println("Area of square is "+area);
    }
}
