/*Question 4 :Determine if 2 Strings are anagrams of each other.
What are anagrams? 
If two strings contain the same characters but in a different order,they can be said to be anagrams.
Consider race and care. In this case,race's characters can be formed into a study, or care's characters can be formed into race.
Below is a java program to check if two strings are anagrams or not */
import java.util.*;
public class anagram {
    public static boolean anagramword(String str1,String str2) {
        //Convert Strings to lowercase. Why? so that we don't have to checkseparately for lower & uppercase.
        str1= str1.toLowerCase();
        str2= str2.toLowerCase();
        // First check - if the lengths are the same
        
        if(str1.length() ==str2.length())  {
            // convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            // sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            
            if(Arrays.equals(str1charArray,str2charArray)==true) {
                return true;
            };
        
        }
        return false;
    }
    public static void main(String args[]) {
        String str1 = "race";
        String str2 = "care";
        System.out.println("The two strings "+str1+"&"+str2+" are anagram: "+anagramword(str1, str2));
    }
}
