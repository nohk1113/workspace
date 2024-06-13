package class_basic.Interface.array;

public class MyArray {
    public int getTwoArrayAvg(int[] arr1, int[] arr2){
        int a=0;
        int b=0;
        for(int i=0; i<arr1.length; i++){
            arr1[i]=a+i;
            a++;
        }
        for(int i=0; i<arr2.length; i++){
            b=b+i;
            b++;
        }
        return (a+b)/(arr1.length+arr2.length);
    }


    public int isEvenArray(int[] array){
        return 0;
    }

}

