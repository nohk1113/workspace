package 여섯번째_배열;

public class Test_11 {
    public static void main(String[] args) {
        int num=0;
        int[] arr=new int[8];
        for(int i=0; i<arr.length;i++){
            arr[i]=i+1;
        }
        for(int i=1; i<9 ;i++ ){
            if (i%2==0){
                num=num+1;
            }
        }
        System.out.println(num);
    }
}
