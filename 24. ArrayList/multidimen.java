/*
list1: 1 2 3 4 5 
list2: 2 4 6 8 10
list3: 3 6 9 12 15
*/
import java.util.*;
public class multidimen {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1; i<=5; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);

        for(int i = 0; i<mainList.size(); i++) {
            ArrayList<Integer> currlist = mainList.get(i);
            for(int j = 0; j<currlist.size(); j++) {
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }

    }
}
