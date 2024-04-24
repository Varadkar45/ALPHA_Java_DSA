/*Pair Sum - 1

Find if any pair in a Sorted ArrayList has a target sum.

list = [1, 2, 3, 4, 5, 6], target=5 
2 pointer Approach*/
import java.util.*;
public class pairsumtwopointer {
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0, rp = list.size()-1;
        while(lp!=rp) {
            //case 1
            if(list.get(lp)+list.get(rp)==target) {
                return true;
            }
            //case 2
            if(list.get(lp)+list.get(rp)<target) {
                lp++;
            } else {
                //case 3
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;    
        System.out.println(pairSum1(list, target));
    }
}
