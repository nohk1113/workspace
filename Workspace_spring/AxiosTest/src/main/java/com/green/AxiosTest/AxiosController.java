package com.green.AxiosTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// @RestController : 컨트롤러 안의 메서드 리턴이 html파일명이 아니다!
@RestController
public class AxiosController {

    @GetMapping("/test1")
    public String test1(){
        return "집에 가고싶다.";
    }
    @GetMapping("/test2")
    public int test2(){
        return 100;
    }
    @GetMapping("/test3")
    public int[] test3(){
        int[]arr={1,2,3,4,5};
        return arr;
    }
    @GetMapping("/test4")
    public List<ItemVO> test4(){
        List<ItemVO> items=new ArrayList<>();
//        itemVO 객체를 세개 리액트로 전달
        ItemVO itemVO1=new ItemVO(1, "손오공과 자바", 20000, "소개1", "book_1.jpg");
        ItemVO itemVO2=new ItemVO(2, "판타지와 자바", 15000, "소개2", "book_2.jpg");
        ItemVO itemVO3=new ItemVO(3, "모두의 마블 모두해", 10000, "소개3", "book_3.jpg");

        items.add(itemVO1);
        items.add(itemVO2);
        items.add(itemVO3);
        return items;
    }
}
