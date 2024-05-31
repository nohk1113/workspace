package If_문제_1;

public class Test5 {
    public static void main(String[] args) {
        int x=50;
        if(x>90){
            System.out.println("학점은 A입니다");
        }
        else if(x>80&& x<=90){   // x>80&& x<=90    이렇게 해도됨
            System.out.println("학점은 B입니다.");
        }
        else {
            System.out.println("학점은 C입니다.");
        }
    }
}
