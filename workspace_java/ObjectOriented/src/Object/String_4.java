package Object;

public class String_4 {
    public static void main(String[] args) {
        String a="짜장면";
        String b="짬뽕";
        System.out.println(a.concat(b));
//        concat : 두 문자열을 나열 하는것
        String str1="abcdefg";
        System.out.println(str1.substring(2));
//  문자열에서 일부만 추출    두번째 글자부터 추출하겠다 라는 의미
        System.out.println(str1.substring(2, 4));
//        2번째 글자 부터 4번 째 글자 까지 추출  순서는 0부터 (0,1,2,3,4,5,6)

        String str2="집가고싶당";
        System.out.println(str2.length());
//        length : 문자열 길이

        String str3="피자,치킨,족발";
        String[] result=str3.split(",");
        System.out.println(result[0]);
    }
}
