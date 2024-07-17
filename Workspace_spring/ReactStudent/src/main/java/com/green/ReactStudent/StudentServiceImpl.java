package com.green.ReactStudent;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private SqlSessionTemplate sqlSession;

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
}
