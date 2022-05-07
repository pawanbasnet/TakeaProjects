package com.ims.dao;

public interface UserDao {
    void register();
    boolean verify(String email, String pass);
}
