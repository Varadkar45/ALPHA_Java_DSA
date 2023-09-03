public class funcover2 {
    public static int sum(int a, int b) {
        return a+b;
    }

    public static float sum(float a, float b) {
        return a+b;
    }
    public static void main(String args[]) {
        System.out.println(sum(4,2));
        System.out.println(sum(4.2f,2.8f));
    }
}
//function overloading using data types