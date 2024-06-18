package exception;

public class Exception_3 {
    public static void main(String[] args) {
        bbb();
    }
    public static void aaa()throws Exception{  // (throws)예외를 처리 안하고 넘어가겠음
        System.out.println(5/0);
    }
    public  static void bbb()throws Exception{
        aaa();
    }
}
