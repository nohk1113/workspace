package com.green.DataPractice.vo;

import java.util.Arrays;

public class OrderVO {
    // 주문 정보
    private String menu;
    private int num;
    private String[] add;
    private String req;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String[] getAdd() {
        return add;
    }

    public void setAdd(String[] add) {
        this.add = add;
    }

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "menu='" + menu + '\'' +
                ", num=" + num +
                ", add=" + Arrays.toString(add) +
                ", req='" + req + '\'' +
                '}';
    }
}
