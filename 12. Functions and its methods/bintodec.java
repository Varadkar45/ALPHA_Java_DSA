public class bintodec {
    public static void binTodec(int binNum) {
        int Decnum = binNum;
        int pow = 0;
        int deciNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            deciNum = deciNum + (lastDigit *(int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;

        }
        System.out.println("decimal of "+ Decnum +" = " + deciNum);



    }

    public static void main(String args[]) {
        binTodec(101);
    }
    
}
