package class_basic.Static;

public class AccTest {
    public static void main(String[] args) {
        Account a1=new Account("11111", 10000);
        Account a2=new Account("15678", 200000);
        Account a3=new Account("85451", 30000);
        Account a4=new Account("58455", 40000);
        Account a5=new Account("15641", 50000);

        System.out.print(a1);
        Account.iyul=10.0;
    }
}
