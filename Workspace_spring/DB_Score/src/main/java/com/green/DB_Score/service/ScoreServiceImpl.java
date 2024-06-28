package com.green.DB_Score.service;

import com.green.DB_Score.VO.ScoreVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("scoreService")
public class ScoreServiceImpl implements ScoreService{
    @Autowired
    private SqlSessionTemplate sqlSession;


    @Override
    public List<ScoreVO> getStuList() {
//             mapper 파일의 id 와   insert의 id 이름을 똑탕이 적으면 된다 (mapper에 가면 있음)
       List<ScoreVO> list=sqlSession.selectList("scoreMapper.getStuList");
        return list;
    }

    @Override
    public void insertStudent(ScoreVO scoreVO) {
        sqlSession.insert("scoreMapper.insertStudent", scoreVO);
    }

    @Override
    public ScoreVO getStuDetail(int stuNum) {
        // 셀렉트 원 = 조회한 행이 1개일 때
        ScoreVO student=sqlSession.selectOne("scoreMapper.getStuDetail", stuNum);
        //   mapper id  ,  불러올 정보

        return student;
    }

    @Override
    public int delete(int stuNum) {
        int delete=sqlSession.delete("scoreMapper.delete",stuNum );
        return delete;
    }

    @Override
    public int update(ScoreVO scoreVO) {
        int update=sqlSession.update("scoreMapper.update", scoreVO);
        return update;
    }

    @Override
    public void updateStudent(ScoreVO scoreVO){
        sqlSession.update("scoreMapper.updateStudent", scoreVO);
    }


}
