package com.green.CarTest.controller;

import com.green.CarTest.service.CarService;
import com.green.CarTest.vo.CarInfoVO;
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
    public List<CarInfoVO> getCarList() {
        return carService.getCarList();
    }

//        자동차 정보 등록
    @PostMapping("/info")
    public void insertCar(@RequestBody CarInfoVO carInfoVO){
        carService.insertCar(carInfoVO);
    }

}
