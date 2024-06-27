package com.green.DB_Score.service;

import com.green.DB_Score.VO.ScoreVO;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("scoreService")
public class ScoreServiceImpl implements ScoreService{
    @Autowired
    private SqlSessionTemplate sql;


    @Override
    public List<ScoreVO> getStu() {
       List<ScoreVO> list=sql.selectList("scoreMapper.getStuList");
        return list;
    }
}
