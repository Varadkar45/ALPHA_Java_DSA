public class butterflypattern {
    public static void butterfly(int n) {
        //1st half
        for(int i=1; i<=n; i++) {
            //for stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //for spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            //for stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nf half
        for(int i=n; i>=1; i--) {
            //for stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //for spaces
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]) {
        butterfly(5);
    }
}
