package com.green.CarTest.vo;

import lombok.Data;

import java.util.List;


@Data
public class SalesVO {
    private int salesPk;
    private String buyerName;
    private String buyerTel;
    private String color;
    private String buyDate;
    private int carPk;
    private int carPrice;
    private List<CarInfoVO> carInfoVO;
}
