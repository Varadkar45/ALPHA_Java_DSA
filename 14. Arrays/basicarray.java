import java.util.*;
public class basicarray {
    public static void main(String args[]) {
        int marks[] = new int[50];
        System.out.println("Length of the array is"+marks.length);
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();//physics
        marks[1] = sc.nextInt();//chemistry
        marks[2] = sc.nextInt();//maths
        System.out.println("physics :"+marks[0]);
        System.out.println("chemistry :"+marks[1]);
        System.out.println("maths :"+marks[2]);
        int percentage = (marks[0]+marks[1]+marks[2])/(3);
        System.out.println("Percentage obtained:"+percentage+"%");
    }
    
}
