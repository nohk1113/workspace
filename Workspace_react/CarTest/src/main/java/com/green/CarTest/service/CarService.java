package com.green.CarTest.service;

import com.green.CarTest.vo.CarInfoVO;

import java.util.List;

public interface CarService {

//    자동차 목록 조회
    List<CarInfoVO> getCarList();

//    자동차 정보 등록
    void insertCar(CarInfoVO carInfoVO);
}
