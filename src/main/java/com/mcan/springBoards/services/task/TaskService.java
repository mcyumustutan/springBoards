package com.mcan.springBoards.services.task;


public interface TaskService {
    public void add(String title, String content);
    public void remove(long id);
}
