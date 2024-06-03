package 네번째_조건문;

//switch case break
//switch(변수){
// case 값1 :
// case 값2 :
// case 값3 :
// }
public class Case_1 {
    public static void main(String[] args) {
        System.out.println("시작");
        int num=10;

        switch (num){    // 넘 값이 1일 때 실행 내용
            case 1:
                System.out.println(1);
                break;   // break 문을 만나면 switch 문 종료
            case 3:
                System.out.println(3);
                break;
            case 5:
                System.out.println(5);
                System.out.println(5);
                break;
            case 7:
                System.out.println(7);
                break;
            default:   // 그밖에는..
                System.out.println("해당없음");
               // 마지막에는 break를 쓰지 않는다
        }

        System.out.println("종료");
    }
}
