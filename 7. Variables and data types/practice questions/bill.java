import java.util.*;

public class bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float item1 = sc.nextFloat();
        float item2 = sc.nextFloat();
        float item3 = sc.nextFloat();

        float total = item1+item2+item3;
        float bill= total+(0.18f*total);
        System.out.println("Total Bill including GST "+bill);
        System.out.println("Total bill without GST "+total);
        

    }
    
}
