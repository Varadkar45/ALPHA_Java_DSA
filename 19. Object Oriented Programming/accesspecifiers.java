public class accesspecifiers {
    public static void main(String args[]) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "shreyasvaradkar";
        //myAcc.password = "xyzabc";//here not accessible w but we can accesss it through function
        myAcc.setPassword("xyzabc");
        System.out.println(myAcc.username);
        //System.out.println(myAcc.password); no access possible only can change through setPassword

    }    
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;// Here it is accessible as it is accessing inside the class only
    }
}