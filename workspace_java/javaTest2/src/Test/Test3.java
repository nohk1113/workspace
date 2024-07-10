package Test;

public class Test3 {
//    정수 {5, 11, 20, 40, 30}의 초기값을 갖는 배열을 생성하고, 해당 배열에서 가장 큰 값과 가장 작은 값을 출
//    력하시오.
public static void main(String[] args) {
    int[] a={5,11,20,40,30};

    int max=a[0];
    int min=a[0];

//        가장 큰값
    for(int i=0; i<a.length; i++){
        if(a[i]>max){
            max=a[i];
        }
        if(a[i]<min){
            min=a[i];
        }
    }
    System.out.println("배열에서 가장 큰값 :"+ max);
    System.out.println("배열에서 가장 작은 값 :"+ min);
}

}
