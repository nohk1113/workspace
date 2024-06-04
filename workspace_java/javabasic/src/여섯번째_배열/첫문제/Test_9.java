package 여섯번째_배열.첫문제;

public class Test_9 {
    public static void main(String[] args) {
        int[] arr={1,5,7};
        int num=0;
        for (int i=0; i<arr.length;i++){
            num=arr[i]+num;
        }
        System.out.println(num);
    }
}
