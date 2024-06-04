package 다섯_반복문.For;

public class For_1 {
    public static void main(String[] args) {
//        int i=1;
//
//        while (i<11){
//            System.out.println(i);
//            i++;
//        }
//  해석 순서     1번     2번     4번
//        for(int i= 1; i<11 ; ++i){
//            //              3번
//            System.out.println(i);
//        }
        int sum=0;
        for(int i=1; i<11;i++){
            sum=sum+i;
        }
        System.out.println(sum);

    }
}
