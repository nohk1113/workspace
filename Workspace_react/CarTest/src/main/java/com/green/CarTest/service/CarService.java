package com.green.CarTest.service;

import com.green.CarTest.vo.CarInfoVO;
import com.green.CarTest.vo.SalesVO;

import java.util.List;

public interface CarService {

//    자동차 목록 조회
    List<CarInfoVO> getCarList(CarInfoVO carInfoVO);

//    자동차 정보 등록
    void insertCar(CarInfoVO carInfoVO);

//    자동차 구매 고객 등록
    void insertBuyer(SalesVO salesVO);

//    자동차 구매 고객 목록 조회
    List<SalesVO> getBuy(SalesVO salesVO);

//    차 목록 조회(이름과 번호만)
    List<CarInfoVO> getCar();
}
