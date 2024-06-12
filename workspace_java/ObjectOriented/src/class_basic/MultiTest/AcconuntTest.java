package class_basic.MultiTest;

public class AcconuntTest {
    public static void main(String[] args) {
        Account acc=new Account();
        // 객체 초기화 (객체 생성 시 최초 1회 실행)
//        acc.initAcconunt();     // 초기화
        acc.printAccount();   // 출력

        Account acc1=new Account(100000);
        acc1.printAccount();

//        acc1.setAcconunt();


    }
}
