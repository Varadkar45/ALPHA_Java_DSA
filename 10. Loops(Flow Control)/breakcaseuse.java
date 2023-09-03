import java.util.*;
public class breakcaseuse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter your Number:");
            int num = sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println(num);

        }while(true);


    }
}
//keep entering till user enters a number whic is multiple of 10