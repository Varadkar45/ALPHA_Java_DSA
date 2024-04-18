/*Find Subsets

Find & print all subsets of a given string
"abc"
Output:
a, b, c, ab, bc, ac, abc */
public class subsets {
    public static void findSubsets(String str, String ans, int i) {
        //Base Case
        if(i==str.length()) {
            if(ans.length()==0) {
                System.out.print("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        //Recursion        
        //Yes 
        findSubsets(str, ans+str.charAt(i), i+1);
        //No
        findSubsets(str, ans, i+1);

    }
    public static void main(String args[]) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
    
}
