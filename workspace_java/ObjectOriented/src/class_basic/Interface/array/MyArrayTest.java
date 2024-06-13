package class_basic.Interface.array;

public class MyArrayTest {
    public static void main(String[] args) {
        MyArray nn= new MyArray();
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,5,8};
        System.out.println(nn.getTwoArrayAvg(arr1,arr2 ));
    }
}
