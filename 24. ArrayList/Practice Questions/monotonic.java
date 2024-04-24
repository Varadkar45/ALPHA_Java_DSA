/*Question 1 :
Monotonic ArrayList (EASY)
An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An
Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
Sample Input 1 : nums = [1,2,2,3]
Sample Output 1 : true
Sample Input 2 : nums = [6,5,4,4]
Sample Output 2 : true
Sample Input 3 : nums = [1,3,2]
Sample Output 3 : false
Constraints :
●   1 <= nums.size() <= 105
● -105 <= nums.get(i) <= 105*/
import java.util.*;
public class monotonic {
    public static boolean specifyMonotonic(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;
        
        for(int i = 0; i<list.size()-1; i++) {
            if(list.get(i)>list.get(i+1)) {
                inc = false;
            }
            if(list.get(i)<list.get(i+1)) {
                dec = false;
            }
        }
        
        return inc||dec;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(specifyMonotonic(list));
    }
}