package class_basic.mem;

public class Member {
    private  String name;
    private String id;
    private String password;
    private int age;

    public Member(String name, String id){
        this.name=name;
        this.id=id;
        Member user1= new Member("홍길동", "hong");
        Member user2= new Member("강자바", "java");
    }
}
