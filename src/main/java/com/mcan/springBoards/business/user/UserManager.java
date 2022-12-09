package com.mcan.springBoards.business.user;

import com.mcan.springBoards.dataAccess.UserRepository;
import com.mcan.springBoards.entities.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserRepository userRepository;

    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void login(String email, String password) {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(email);
        userEntity.setPassword(password);
        this.userRepository.save(userEntity);
    }

    @Override
    public void register(String firstName, String lastName, String email, String password) {
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(firstName);
        userEntity.setLastName(lastName);
        userEntity.setEmail(email);
        userEntity.setPassword(password);
        this.userRepository.save(userEntity);
    }

}
