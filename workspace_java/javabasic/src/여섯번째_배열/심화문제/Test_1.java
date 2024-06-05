package 여섯번째_배열.심화문제;
// 배열 안에서 제일 큰 숫자만 도출
public class Test_1 {
    public static void main(String[] args) {
        int max=0;
        int[] array={1,5,3,8,2};

        for(int i=0; i<array.length; i++){
            if (max < array[i]){
                max=array[i];
            }
        }
        System.out.println("max"+max);
    }
}
