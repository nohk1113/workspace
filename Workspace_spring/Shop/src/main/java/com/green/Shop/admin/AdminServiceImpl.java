package com.green.Shop.admin;

import com.green.Shop.item.VO.CategoryVO;
import com.green.Shop.item.VO.ItemVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    //카테고리 목록 조회
    @Override
    public List<CategoryVO> getCategoryList() {
        return sqlSession.selectList("adminMapper.getCategoryList");
    }

//    아이템 등록
    @Override
    public void insertItem(ItemVO itemVO) {
        sqlSession.insert("adminMapper.insertItem", itemVO);
    }

}
