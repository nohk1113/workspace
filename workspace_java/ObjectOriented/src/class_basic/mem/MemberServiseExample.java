package class_basic.mem;

public class MemberServiseExample {
    public static void main(String[] args) {
        MemberServise memberServise=new MemberServise();
        boolean result= memberServise.login("hong", "12345");

        if (result){
            System.out.println("로그인 되었습니다.");
            memberServise.logout("hong");
        }
        else {
            System.out.println("id또는 password가 올바르지 않습니다");
        }
    }
}
