import java.util.*;
public class operations {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        // add Element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //get element
        int element = list.get(1);
        System.out.println(element);

        // remove element
        list.remove(2);
        System.out.println(list);
        // set element at index

        list.set(1,10);
        System.out.println(list);

        // contains element

        System.out.println(list.contains(4));
        System.out.println(list.contains(11));
    }
    
}
