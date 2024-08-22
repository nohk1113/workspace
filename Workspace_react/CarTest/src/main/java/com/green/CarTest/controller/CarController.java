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
    public void insertBuyer(@RequestBody CarInfoVO carInfoVO){
        carService.insertBuyer(carInfoVO);
    }

//    구매자 차량 목록 조회
    @PostMapping("/buyer")
    public List<SalesVO> getBuy(){
        return carService.getBuy();
    }

//    자동차 번호와 이름만 조회
    @GetMapping("/carList")
    public List<CarInfoVO> getCar(){
        return carService.getCar();
    }
}
