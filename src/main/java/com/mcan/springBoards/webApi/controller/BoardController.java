package com.mcan.springBoards.webApi.controller;

import com.mcan.springBoards.services.board.BoardRequest;
import com.mcan.springBoards.services.board.BoardResponse;
import com.mcan.springBoards.services.board.BoardService;
import com.mcan.springBoards.entities.BoardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/boards")
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/add")
    public BoardResponse add(@RequestBody BoardRequest boardRequest) {
        return this.boardService.add(boardRequest);
    }

    @GetMapping(value = "/", params = {"page", "size"})
    public Page<BoardEntity> getAll(@RequestParam("page") int page, @RequestParam("size") int size) {
        return this.boardService.getAll(page, size);
    }

}
