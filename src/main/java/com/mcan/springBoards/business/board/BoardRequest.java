package com.mcan.springBoards.business.board;

import lombok.Data;

@Data
public class BoardRequest {
    private String name;
    private int order_number;
    private String color;
}
