package 일곱_메서드.메서드_심화_문제;

public class Test_7 {
    public static void main(String[] args) {
        String[] arr={"a", "b", "c"};
        String result=test(arr);
        System.out.println(result);
    }
    public static String test(String[] arr){
        String result="";
        for (int i=0; i<arr.length;i++ ){
            result=result+arr[i];
        }
        return result;
    }
}
