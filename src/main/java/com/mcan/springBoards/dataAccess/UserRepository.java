package com.mcan.springBoards.dataAccess;

import com.mcan.springBoards.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
