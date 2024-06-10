package class_basic.car;

import java.sql.SQLOutput;

public class Car {
    String brand;
    String modelName;
    String carNumber;
    int price;
    String owner;

    // 값을 변경하는 메서드 만들기,  set은 값의 변경하는 이름으로 많이 쓰임
    public void setBrand(String b){ // String b :문자열 데이터가 들어간다는것
        brand=b;
    }
    public void setModelName(String model){
        modelName=model;
    }
    public void setCarNumber(String number){
        carNumber=number;
    }
    public void setPrice(int p){
        price=p;
    }
    public void setOwner (String o){
        owner=o;
    }
    public void printCarInto(){
        System.out.println("브랜드 : "+brand);
        System.out.println("모델명 : "+modelName);
        System.out.println("차번호 : "+carNumber);
        System.out.println("가격 : "+price);
        System.out.println("소유주 : "+owner);
    }
}
