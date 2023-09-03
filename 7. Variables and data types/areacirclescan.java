import java.util.*;

public class areacirclescan {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = 3.14f*radius*radius;//if written only 3.14 it will consider it as double which will throw error
        System.out.println("Area of circle is "+area);

    }
}
