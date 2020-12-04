package com.example.login.dao;

import com.example.login.model.login;

public interface UserDAO {
    public login selectUser(login login) throws Exception;
}


