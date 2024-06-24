package com.green.ListPrasctice.service;

import com.green.ListPrasctice.VO.StudentVO;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
//     학생 관리 프로그램의 핵심 기능을 정의
//        학생을 저장할수있는 통
List<StudentVO> list=new ArrayList<>();
//     학생 목록을 조회
    public List<StudentVO> getStuList(){
        return list;    // 자료형은 리스트 임 (return 에 준거랑 같은것을 주면 됨)
    }
//     학생 등록
    public void regStudent(StudentVO studentVO){
        list.add(studentVO);    // 데이터 저장 (add)
    }
//     학생 상세 조회
    public StudentVO getStuDetail(int stuNum){
//        학번이 일치하는 학생을 저장할 공간
        StudentVO findStudent=null;
        for(StudentVO StudentVO:list){
            if (StudentVO.getStuNum()==stuNum ){
                findStudent=StudentVO;
            }
        }
        return findStudent;
    }
//     학생 정보 삭제
    public void deleteStu(int stuNum){
//        삭제를 위해서는 삭제할 index 번호가 필요
        int index = 0;
        for (int i=0; i<list.size();i++){
            if(list.get(i).getStuNum()== stuNum){
                index=i;
            }
        }
        list.remove(index);           // 리턴 안해도됨
    }

//     학생 정보 수정
    public void updateStu(StudentVO studentVO){
//        리스트에서 정보를 수정하고자 하는 학생을 찾아 그 학생의 정보를 input  태그 및 textarea에서 입력한 정보로 변경한다.
        for (StudentVO student:list){
            if(student.getStuNum()==student.getStuNum()){  // 학번
                student.setName(student.getName());
                student.setKoScore(student.getKoScore());
                student.setEnScore(student.getEnScore());
                student.setIntro(student.getIntro());
            }
        }
    }
}
