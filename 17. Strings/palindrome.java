public class palindrome {
    public static boolean isPalindrome(String str) {
        for(int i = 0; i<str.length(); i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        String str = "racecar";
        String str2 = "Shreyas";
        System.out.println("The String is Palindrome "+ str + " " +isPalindrome(str));
        System.out.println("The String is Palindrome "+ str2 +" " +isPalindrome(str2));
    }
}
