/*Count how many times lowercase vowels occurred in a String entered by the user. */
public class lowercasevowels {
    public static int vowels(String str) {
        int count = 0;
        for(int i = 0;i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        String str = "shreyas";
        System.out.println("The number of Vowels in String "+str+" is "+vowels(str));
    }
}
// output : The number of Vowels in String shreyas is 2