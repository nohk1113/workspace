package com.green.CarTest.service;

import com.green.CarTest.vo.CarInfoVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("carService")
public class CarServiceImpl implements CarService{

    @Autowired
    private SqlSessionTemplate sqlSession;

//자동차 목록 조회
    @Override
    public List<CarInfoVO> getCarList() {
        return sqlSession.selectList("carMapper.getCarList");
    }

//    자동차 정보 등록
    @Override
    public void insertCar(CarInfoVO carInfoVO) {
        sqlSession.insert("carMapper.insertCar", carInfoVO);
    }
}
