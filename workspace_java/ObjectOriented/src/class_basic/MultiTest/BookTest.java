package class_basic.MultiTest;

public class BookTest {
    public static void main(String[] args) {
        Book book=new Book("java", "kim", 1000);  // 북 정보를 가져오는것
        // 이것만 하면 초기값을 불러온것임
        Book boo2=new Book("python", "lee", 2000);

        int m;         // 같다!!!
        Book book3=book;  // 자료형 변수명
        System.out.println(book.title);
        System.out.println(book3.title);
        book.title="C++";
        System.out.println(book.title);
        System.out.println(book3.title);

        int a=10;
        int b=a;
        a=5;
        System.out.println(a);// 5
        System.out.println(b);// 10

        // 기본자료형 : (ex)int
        int num=5;
        int num2=num;  // 넘2=5
        double num3=num2;  // 넘3=5.0

        double num4=5.5;
//        int num5=num4;              // 오류

        int num6=7;
//        String num7=num6;           // 오류

        int[] arr1={1,2,5};
//        String[] arr2=arr1;          // 오류
        int[] arr2=arr1;
    }
}
