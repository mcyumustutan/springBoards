package com.mcan.springBoards.dataAccess;

import com.mcan.springBoards.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {
}
