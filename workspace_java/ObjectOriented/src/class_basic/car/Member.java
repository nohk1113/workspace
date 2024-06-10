package class_basic.car;

public class Member {
    String name;
    String id;
    String pasward;
    int age;

    public void setNameInfo(String n, String i, String p, int a){  // info 전부 변경
        name=n;
        id=i;
        pasward=p;
        age=a;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasward() {
        return pasward;
    }

    public void setPasward(String pasward) {
        this.pasward = pasward;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    public void setId(String i){
//        id=i;
//    }
//    public void setPasward(String p){
//        pasward=p;
//    }
//    public void setAge(int a){
//        age=a;
//    }
    public void  printCarInto(){
        System.out.println("이름 : "+name);
        System.out.println("아이디 : "+id);
        System.out.println("비밀번호 : "+pasward);
        System.out.println("나이 : "+age);
    }
     // 회원의 이름 변경
    public void setName(String n){
        name=n;
    }
}
