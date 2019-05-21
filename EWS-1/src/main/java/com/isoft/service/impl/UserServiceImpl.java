package com.isoft.service.impl;

import com.isoft.dao.IUserDAO;
import com.isoft.dao.impl.UserDAOimpl;
import com.isoft.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userservice")

public class UserServiceImpl implements IUserService{
    IUserDAO userDAO;
    @Override    
    public String login(String uname, String upwd) {

        String str = userDAO.login(uname,upwd);
        return str;
    }

    @Override
    public boolean register(String uname, String upwd, String email) {
        boolean temp = userDAO.register(uname,upwd,email);
        return temp;
    }
}
