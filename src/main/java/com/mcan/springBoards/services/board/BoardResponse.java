package com.mcan.springBoards.services.board;

import lombok.Data;

@Data
public class BoardResponse {
    private long id;
    private String name;
    private int order_number;
    private String color;
}
