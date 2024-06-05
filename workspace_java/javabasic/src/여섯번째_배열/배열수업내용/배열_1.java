package 여섯번째_배열.배열수업내용;

public class 배열_1 {
    public static void main(String[] args) {
//        배열은 같은 자료형을 여러개 저장할수있음

//        정수를 저장할수있는 배열 선언
        int[] arr1;
        String[] arr2;
        double[] arr3;

//        배열 생성
        arr1=new int[3];   // 정수를 저장할 공간 3개를 생성
        arr2=new  String[5];  // 문자열을 저장할 공간 5개를 생성
        arr3=new double[10];  //실수를 저장할 공간 10개를 생성

//        arr1 배열을 출력
        System.out.println(arr1[0]);

        //5개의 정수를 저장할수 있는 배열 arr4를 생성
        int[] arr4=new int[5];
        // 실수를 2개 저장할수 있는 배열 arr5를 생성
        double[] arr5=new double[2];
    }
}
