package 여섯번째_배열.배열수업내용;

public class 배열과기본자료형의차이 {
//     기본자료형 (예: int)는 값이 복사가 된것
//     참조형(예: 배열)은  값이 아니라 값이 있는 주소를 복사
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        // a=는 {1,3,5}라는 데이터가 있는 주소
        int[] b = a;
        // 주소를 b에게 부여를 함
        a[0] = 10;
        // a주소 0번에 10의 값을 줌
        b[2]= 50;
        // b는 현재 a의 주소를 가지고있음 고로 a주소 2번에 50을 주는것임

        for (int e : a) {
            System.out.print(e + " ");
        }

        System.out.println();
        for (int e : b) {
            System.out.print(e + " ");

        }

        int[] c= {1,2,3};
        int[] d= c.clone();
    }
}
