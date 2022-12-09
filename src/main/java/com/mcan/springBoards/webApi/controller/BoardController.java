package com.mcan.springBoards.webApi.controller;

import com.mcan.springBoards.business.board.BoardRequest;
import com.mcan.springBoards.business.board.BoardResponse;
import com.mcan.springBoards.business.board.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/boards")
public class BoardController {

    private BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService){
        this.boardService = boardService;
    }

    @PostMapping("/add")
    public BoardResponse add(@RequestBody BoardRequest boardRequest){
        return this.boardService.add(boardRequest);
    }

}
