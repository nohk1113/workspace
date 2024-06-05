package 여섯번째_배열.둘문제;

public class Test_5 {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int[] newarr=new int [5];
         for (int i=0; i <arr.length; i++){
             newarr[i]=arr[i];
         }
         for (int e: newarr){
             System.out.println(e);

         }


    }
}
