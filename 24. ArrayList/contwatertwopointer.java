/*Container with Most Water
For given n lines on x-axis, use 2 lines to form a container such that it holds maximum water.
height = [1,8,6,2,5,4,8,3,7]
Two Pointer Approach*/
import java.util.*;
public class contwatertwopointer {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0, rp = height.size()-1;

        while(lp<rp) {
            //calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWater = ht*width;
            maxWater =  Math.max(maxWater, currWater);

            //update ptr
            if(height.get(lp)<height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String arg[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
