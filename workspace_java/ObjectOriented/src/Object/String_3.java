package Object;

public class String_3 {
    public static void main(String[] args) {
//         string 객체의 특이점
//         string 객체는 Imutable(값이 변하지 않는)
        String addr1="울산";
        String addr2=addr1;
        addr1="서울";
        System.out.println(addr1);
        System.out.println(addr2);

        String a="java";
        a="python";
        System.out.println(a);
    }
}
