package com.green.CarTest.controller;

import com.green.CarTest.service.SalesService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales")
public class SalesController {
    @Resource(name= "salesService")
    private SalesService salesService;
}
