package com.zy.me.controller;

import com.zy.me.model.Users;
import com.zy.me.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping(value = "me/user")
public class UserController {

    @Resource(name = "userService")
    UserService userService;


    @RequestMapping(value = "/signup",method = RequestMethod.POST)
    @Transactional(rollbackFor = RuntimeException.class)
    public @ResponseBody String hello(HttpServletRequest request){

        Users user = new Users();
        user.setUserName(request.getParameter("username"));
        user.setPassword(request.getParameter("psw"));
        user.setGender(Integer.parseInt(request.getParameter("gender")));
        user.setProfessionCode(request.getParameter("pro_code"));
        user.setProfessionName(request.getParameter("pro_name"));
        user.setMobileNum(request.getParameter("mobileNum"));
        user.setId(UUID.randomUUID().toString());
        user.setUserId(UUID.randomUUID().toString());
        try {
            userService.insert(user);
        }catch (Exception e){
            return e.getMessage();
        }

        return "注册成功";
    }

}
