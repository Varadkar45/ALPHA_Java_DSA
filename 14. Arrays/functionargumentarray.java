public class functionargumentarray {
    public static void update(int marks[], int nonchangeable) {
        nonchangeable = 10;
        for(int i = 0; i<marks.length; i++) {
            marks[i] = marks[i]+1;
        }
    }

    public static void main(String args[]) {
        int marks[] = {99,98,97};
        int nonchangeable = 5; // this value is printed
        update(marks, nonchangeable);
        System.out.println(nonchangeable);

        //print r
        for(int i =0; i<marks.length;i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
