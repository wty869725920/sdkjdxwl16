package com.isoft.action;

import com.isoft.service.IUserService;
import com.isoft.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    IUserService userService;
    @RequestMapping("/login.do")
    @ResponseBody
    public String login(String uname, String upwd) {
        /*硬编码*/
        IUserService userService = new UserServiceImpl();
        String str=userService.login(uname,upwd);
        return str;
//        if (uname.equals("admin") && upwd.equals("123456"))
//            return "success";
//        else
//            return "fault";

    }

    @RequestMapping("/register.do")
    @ResponseBody
    public String register(String uname, String upwd,String email) {
        /*硬编码*/

        boolean temp = userService.register(uname,upwd,email);

//        System.out.println(email);
//        boolean temp=true;
        if (temp)
            return "success";
        else
            return "fault";

    }
}