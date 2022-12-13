package com.mcan.springBoards.services.board;

import com.mcan.springBoards.entities.BoardEntity;
import org.springframework.data.domain.Page;

public interface BoardService {
    public BoardResponse add(BoardRequest boardRequest);
    public void remove(long id);
    public Page<BoardEntity> getAll(int page, int size);
}
