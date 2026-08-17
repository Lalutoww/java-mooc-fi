
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        Account acc1 = new Account("Matthews account", 1000);
        Account myAcc = new Account("My account", 0);
        acc1.withdrawal(100);
        myAcc.deposit(100);
        
        System.out.println(acc1);
        System.out.println(myAcc);
    }
}
