package test;

import java.util.Scanner;

public class Member {

    private String name;
    private String id;
    private String pw;
    private  int age;
    private Scanner sc;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    void setInfo(String name, String id, String pw, int age){
        this.name=name;
        this.id=id;
        this.pw=pw;
        this.age=age;


    }
    void showInfo(){
        System.out.println("이름"+name);
        System.out.println("아이디"+id);
        System.out.println("비밀번호"+pw);
        System.out.println("나이"+age);
    }

    boolean isLogin(String id, String pw) {
        Scanner sc=new Scanner(System.in);
        try {

        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("로그인이 안됩니다.");
        }
        System.out.println("로그인 되었습니다.");
        return false;
    }

}


