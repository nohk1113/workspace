package com.green.DataPractice.vo;

import java.nio.channels.Pipe;

public class LoginVO {
    private String id;
    private String pw;
    private String name;
    private String tell;
    private String email;
    private String birth;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBerth() {
        return birth;
    }

    public void setBerth(String berth) {
        this.birth = berth;
    }
}
