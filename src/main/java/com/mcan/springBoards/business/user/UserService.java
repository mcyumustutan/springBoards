package com.mcan.springBoards.business.user;

public interface UserService {
    public void login(String email, String password);
    public void register(String firstName, String lastName ,String email, String password);
}
