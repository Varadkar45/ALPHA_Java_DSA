public class stringbuilderbasic {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch < 'z'; ch++) {
            sb.append(ch); // append function is used to add characters one by one
        }

        //O(n^2)Previous string approach
        //O(26)Using StringBuilder approach
        System.out.println(sb);
    }
}
//output : abcdefghijklmnopqrstuvwxy

