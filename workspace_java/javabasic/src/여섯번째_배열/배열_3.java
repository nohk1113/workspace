package 여섯번째_배열;

public class 배열_3 {
    public static void main(String[] args) {
        int[] arr1=new int[5];
        System.out.println(arr1);  // 이상한 값 나옴
        for(int i=0; i< arr1.length; i++){
            System.out.println(arr1[i]);
        }
        System.out.println();

        // 배열의크기를 알수있음
        int[] arr2=new int[2];
        int[] arr3=new int[5];
        int[] arr4=new int[10];

        // 배열명.length 를 사용하면 배열 크기를 알수있다.
        System.out.println(arr4.length);


    }
}
