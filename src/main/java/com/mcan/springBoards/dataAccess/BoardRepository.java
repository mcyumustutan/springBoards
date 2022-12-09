package com.mcan.springBoards.dataAccess;

import com.mcan.springBoards.entities.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {
}
