package com.leilei.iBatis.controll;

import com.leilei.iBatis.pojo.User;
import com.leilei.iBatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserControll {
    @Autowired
    private IUserService userService = null;

    @RequestMapping("saveUser")
    public String saveUser(User user){

        userService.saveUser(user);
        return "/index.jsp";
    }

}
