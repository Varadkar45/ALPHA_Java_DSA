import java.util.Collections;
import java.util.ArrayList;
public class sort {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        //Ascending order
        Collections.sort(list);
        System.out.println(list);

        //Descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.print(list);
    }
        
}
