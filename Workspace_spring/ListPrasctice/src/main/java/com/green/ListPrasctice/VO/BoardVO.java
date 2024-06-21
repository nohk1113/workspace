package com.green.ListPrasctice.VO;
// value object 의 약어  =  VO
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data    // getter, setter, to string 을 만들어줌
public class BoardVO {
private int boardNum;
private  String title;
private  String writer;
private  String createDate;
private  String content;
}
