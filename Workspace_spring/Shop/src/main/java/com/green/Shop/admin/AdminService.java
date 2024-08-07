package com.green.Shop.admin;

import com.green.Shop.item.VO.CategoryVO;
import com.green.Shop.item.VO.ItemVO;

import java.util.List;

public interface AdminService {
//    카테고리 목록 조회
    List<CategoryVO> getCategoryList();

//     아이템 등록
    void insertItem(ItemVO itemVO);
}
