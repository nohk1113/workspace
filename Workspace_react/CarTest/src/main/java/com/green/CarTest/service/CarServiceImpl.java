package com.green.CarTest.service;

import com.green.CarTest.vo.CarInfoVO;
import com.green.CarTest.vo.SalesVO;
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
    public List<CarInfoVO> getCarList(CarInfoVO carInfoVO) {
        return sqlSession.selectList("carMapper.getCarList", carInfoVO);
    }

//    자동차 정보 등록
    @Override
    public void insertCar(CarInfoVO carInfoVO) {
        sqlSession.insert("carMapper.insertCar", carInfoVO);
    }

    //    자동차 구매 고객 등록
    @Override
    public void insertBuyer(SalesVO salesVO) {
        sqlSession.insert("salesMapper.insertBuyer", salesVO);
    }

//    차량구매한 사람 목록 조회
    @Override
    public List<SalesVO> getBuy(SalesVO salesVO) {
        return sqlSession.selectList("salesMapper.getBuy", salesVO);
    }

    @Override
    public List<CarInfoVO> getCar() {
        return sqlSession.selectList("carMapper.getCar");
    }
}
