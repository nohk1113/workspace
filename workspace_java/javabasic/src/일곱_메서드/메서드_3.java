package 일곱_메서드;
/*매개 변수(parameter) : 메서드의 정의 부분 소괄호 안에서 정의된 변수
* (소괄호 안에 변수를 선언)*/
public class 메서드_3 {
    public static void main(String[] args) {
        tellYourName("자바");
        tellYourName("호호");
    }
    public static void tellYourName(String name){  // string name="자바"
        System.out.println("제 이름은 "+ name);
    }
}
