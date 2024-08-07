package com.green.Shop.admin;

import com.green.Shop.item.VO.CategoryVO;
import com.green.Shop.item.VO.ItemVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api_admin")
public class AdminController {
@Resource(name = "adminService")
private AdminService adminService;


    @GetMapping("/getCateList")
    public List<CategoryVO> getCateList(){
        return adminService.getCategoryList();
    }

//    아이템 등록
    @PostMapping("/insertItem")
    public void insertItem(@RequestBody  ItemVO itemVO){
        adminService.insertItem(itemVO);
    }
}
