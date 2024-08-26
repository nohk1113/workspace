package com.green.CarTest.controller;

import com.green.CarTest.service.CarService;
import com.green.CarTest.vo.CarInfoVO;
import com.green.CarTest.vo.SalesVO;
import jakarta.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Resource(name="carService")
    private CarService carService;

    //    자동차 목록 조회
    @GetMapping("/list")
    public List<CarInfoVO> getCarList(CarInfoVO carInfoVO) {
        return carService.getCarList(carInfoVO);
    }

//        자동차 정보 등록
    @PostMapping("/info")
    public void insertCar(@RequestBody CarInfoVO carInfoVO){
        carService.insertCar(carInfoVO);
    }

    //    자동차 구매 고객 등록
    @PostMapping("/buy")
    public void insertBuyer(@RequestBody SalesVO salesVO){
        carService.insertBuyer(salesVO);
    }

//    판매자 목록 조회
    @GetMapping("/buyer")
    public List<SalesVO> getBuy(SalesVO salesVO){
        return carService.getBuy(salesVO);
    }

//    구매자 차량 목록 조회
    @GetMapping("/carList")
    public List<CarInfoVO> getCar(){
        return carService.getCar();
    }
}
