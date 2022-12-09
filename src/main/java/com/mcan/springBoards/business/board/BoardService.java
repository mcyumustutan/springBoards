package com.mcan.springBoards.business.board;

public interface BoardService {
    public BoardResponse add(BoardRequest boardRequest);
    public void remove(long id);
}
