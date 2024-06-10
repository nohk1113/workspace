package class_basic.car;


public class PhoneTest {
    public static void main(String[] args) {
        Phone p=new Phone();

//        System.out.println(p.prise);
        p.prise=-1000;

        p.setPrise(-1000);  // 잘못된 값이 들어오면 알수있음..?
        // 이것을 사용하는것이 좋음
        p.modelName="aa";
    }
}
