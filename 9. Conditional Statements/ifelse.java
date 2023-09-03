public class ifelse{
    public static void main(String args[]) {
        int age = 16;
        if(age>=18) {
            System.out.println("Adult:Allowed for voting and license");
        }
        if(age>13&&age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Still a child");
        }
    }
}