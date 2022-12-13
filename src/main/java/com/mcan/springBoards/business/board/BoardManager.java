package com.mcan.springBoards.business.board;

import com.mcan.springBoards.dataAccess.BoardRepository;
import com.mcan.springBoards.entities.BoardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BoardManager implements BoardService {

    private final BoardRepository boardRepository;

    @Autowired
    public BoardManager(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public BoardResponse add(BoardRequest boardRequest) {
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setName(boardRequest.getName());
        boardEntity.setColor(boardRequest.getColor());
        boardEntity.setOrderNumber(boardRequest.getOrder_number());

        this.boardRepository.save(boardEntity);
        BoardResponse boardResponse = new BoardResponse();
        boardResponse.setId(boardEntity.getId());
        boardResponse.setName(boardEntity.getName());
        boardResponse.setColor(boardEntity.getColor());
        boardResponse.setOrder_number(boardEntity.getOrderNumber());
        return boardResponse;
    }

    @Override
    public void remove(long id) {

    }

    @Override
    public Page<BoardEntity> getAll(int page, int size){
        Pageable firstPageWithTwoElements = PageRequest.of(page, size);
//        return this.boardRepository.findAll(Sort.by(Sort.Direction.ASC,"orderNumber"));
        return this.boardRepository.findAll(firstPageWithTwoElements);
    }
}
