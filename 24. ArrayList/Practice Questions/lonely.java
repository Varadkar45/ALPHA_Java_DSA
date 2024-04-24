/*Question 2 :
Lonely Numbers in ArrayList (MEDIUM)
You are given an integer arraylist nums. A number x is lonely when it appears only once, and
no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
Return all lonely numbers in nums. You may return the answer in any order.
Sample Input 1 : nums = [10,6,5,8]
Sample Output 1 : [10,8]
Explanation :
- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
- 5 is not a lonely number since 6 appears in nums and vice versa.
Hence, the lonely numbers in nums are [10, 8].
Note that [8, 10] may also be returned.
Sample Input 2 : nums = [1,3,5,3]
Sample Output 2 : [1,5]
Explanation :
- 1 is a lonely number since it appears exactly once and 0 and 2 does not appear in nums.
- 5 is a lonely number since it appears exactly once and 4 and 6 does not appear in nums.
- 3 is not a lonely number since it appears twice.
Hence, the lonely numbers in nums are [1, 5].
Note that [5, 1] may also be returned.
Constraints :
● 1 <= nums.size() <= 105
● 0 <= nums.get(i) <= 106*/
import java.util.*;
public class lonely {
    public ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums); // Sorts the list of integers
        ArrayList<Integer> list = new ArrayList<>();

        // Create a new ArrayList to store the lonely numbers
        for(int i = 1; i<nums.size()-1; i++) {
            // Check if the current number is not adjacent to its neighbors
            if((nums.get(i-1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i+1))) {
                list.add(nums.get(i)); // Add the current number to the list if it's lonely
            }
        }
        // If the list has only one element, add it to the lonely list
        if (nums.size() == 1) {
            list.add(nums.get(0));
        }
        // If the list has more than one element, check the first and the last number
        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0)); // Add the first number if it's lonely
            }
            if (nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)) {
                list.add(nums.get(nums.size()-1)); // Add the last number if it's lonely
            }
        }

        return list;
    }
    public static void main(String[] args) {
        lonely lonelyInstance = new lonely(); // Creating an object of the lonely class
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);

        // nums.add(1);
        // nums.add(3);
        // nums.add(5);
        // nums.add(8);

        // Calling the findLonely method using the lonely object
        ArrayList<Integer> result = lonelyInstance.findLonely(nums);
        System.out.println("Lonely numbers: " + result);
        
    }
}
