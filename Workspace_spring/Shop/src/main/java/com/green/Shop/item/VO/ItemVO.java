package com.green.Shop.item.VO;

import lombok.Data;

@Data
public class ItemVO {
    private int itemCode;
    private String itemName;
    private int itemPrice;
    private String itemIntro;
    private int itemStock;
    private String itemStatus;
    private int cateCode;
}
