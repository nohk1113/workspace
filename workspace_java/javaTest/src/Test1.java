import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("정수를 입력하시오");
        int num1= sc.nextInt();
        System.out.println("정수를 입력하시오");
        int num2=sc.nextInt();
        System.out.println("정수를 입력하시오");
        int num3=sc.nextInt();

        int max, mid, min;
        if (num1>num2 && num1>num3){
            max=num1;
            if(num2>num3){
                mid=num2;
                min=num3;
            }
            else {
                mid=num3;
                min=num2;
            }
        }
        else if (num2>num1 && num2>num3){
            max=num2;
            if(num1>num3){
                mid=num1;
                min=num3;
            }
            else {
                mid=num3;
                min=num2;
            }
        }
        else {
            max=num3;
            if(num1>num2){
                mid=num1;
                min=num2;
            }
            else {
                mid=num2;
                min=num1;
            }
        }
        System.out.println(max+">"+mid+">"+min);
    }
}
