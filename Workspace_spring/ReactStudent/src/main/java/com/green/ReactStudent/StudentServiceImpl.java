package com.green.ReactStudent;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private SqlSessionTemplate sqlSession;

//    글 조회
    @Override
    public List<StudentVO> getStudentList() {
        List<StudentVO> studentVOList=sqlSession.selectList("studentMapper.getStudentList");
        return studentVOList;
    }

//     글 등록
    @Override
    public void insertStudent(StudentVO studentVO) {
        sqlSession.insert("studentMapper.insertStudent", studentVO);
    }

//    상세 보기
    @Override
    public StudentVO getStudentDetail(int stuNum) {
        StudentVO studentVO=sqlSession.selectOne("studentMapper.getStuDetail", stuNum);
        return studentVO;
    }

    @Override
    public void delStu(int stuNum) {
        sqlSession.delete("studentMapper.delStu", stuNum);
    }

    @Override
    public void updtateStu(StudentVO studentVO) {
        sqlSession.update("studentMapper.updateStu", studentVO);
    }
}
