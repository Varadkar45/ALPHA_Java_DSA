public class funcover {

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String args[]) {
        System.out.println(sum(4,2));
        System.out.println(sum(4,2,6));
    }
}
// function overloading using parameters