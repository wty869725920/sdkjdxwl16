package com.isoft.dao.impl;

import com.isoft.dao.IUserDAO;
import org.springframework.stereotype.Repository;

@Repository("userDAO")

public class UserDAOimpl implements IUserDAO {

    @Override
    public String login(String uname, String upwd) {
        System.out.println(uname+" "+upwd);
        return null;
    }

    @Override
    public boolean register(String uname, String upwd, String email) {
        System.out.println(email);
        return false;
    }

}
