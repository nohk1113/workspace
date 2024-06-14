package class_basic.Interface.array;

public class MyArray implements MyArrayUtil{
    @Override
    public double getTwoArrayAvg(int[] arr1, int[] arr2){
        int a=0;   // arr1 배열의 합
        int b=0;    // arr2 배열의 합
        for(int i=0; i<arr1.length; i++){
            a=a+arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            b=b+arr2[i];
        }
        return (a+b)/(double)(arr1.length+arr2.length);
    }
    @Override
    public boolean isEvenArray(int[] array){
        for(int e :array){  // 받은 만큼 돈다 (e가 받은 값)
            if(e%2==1){
                return false;
            }
        }
        return false;
    }
}

