import java.util.*;
public class continueusecase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Enter your number");
            int num = sc.nextInt();
            if(num % 10 ==0){
                continue;
            }
            System.out.println("Your number is"+num);
        }while(true);
    }
}
//Display all numbers entered by user expect multiple of 10