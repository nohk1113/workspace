package 여섯번째_배열.배열수업내용;

public class 향상된_For {
    public static void main(String[] args) {
        // for-each문 : 배열에서 값을 읽을때 사용
        int[] arr={3,7,10,5,1};
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println();
//   왼쪽항: 배열에서 데이터 하나씩 차례로 뺏을때 저장할 변수
        // 오른쪽항: 반복할 배열
        for(int e : arr){  // int e=
            System.out.println(e);
        }

        System.out.println();

        double[] arr2={1.1,2.2,3.3};
        for(double e:arr2){
            System.out.println(e);
        }

        System.out.println();

        String[] bb={"a", "b", "c"};
        for (String e: bb){
            System.out.println(e);
        }

        }
}
