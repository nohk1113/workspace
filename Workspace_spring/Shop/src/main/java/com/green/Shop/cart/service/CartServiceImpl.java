package com.green.Shop.cart.service;

import com.green.Shop.cart.vo.CartVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cartService")
public class CartServiceImpl implements CartService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    //장바구니 등록
    @Override
    public void insertCart(CartVO cartVO) {
//        내 장바구니에 상품 존재 여부 확인
       CartVO vo=sqlSession.selectOne("cartMapper.checkCart", cartVO);

//        없으면 insert , 있으면 update
        if(vo==null){
            sqlSession.insert("cartMapper.insertCart", cartVO);
        }
//         있으면 update
        else {
            sqlSession.update("cartMapper.updateCartCntWhenReg", cartVO);
        }
//        sqlSession.insert("cartMapper.insertCart", cartVO);
    }

    @Override
    public List<CartVO> getCartList(String memId) {
        return sqlSession.selectList("cartMapper.getCartList", memId);
    }
}
