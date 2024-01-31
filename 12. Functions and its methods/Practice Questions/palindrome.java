import java.util.*;
public class palindrome {
    public static boolean isPalindrome(int num) {
        int palindrome = num;
        int reverse = 0;
        while(palindrome!=0) {
            int remainder = palindrome%10;
            reverse = reverse * 10+remainder; 
            palindrome = palindrome/10;
        }
        if(num == reverse) {
            return true;
        }
        return false;
    }


    public static void main(String args[]) {
        System.out.println("Please Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPalindrome(num)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        } 
    }
}
