package com.zy.me.controller;

import com.zy.me.model.Users;
import com.zy.me.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping(value = "me/user")
public class UserController {

    @Resource(name = "userService")
    UserService userService;


    /**
     * 注册
     * @param request
     * @return
     */
    @RequestMapping(value = "/signup",method = RequestMethod.POST)
    @Transactional(rollbackFor = RuntimeException.class)
    public @ResponseBody String signup(HttpServletRequest request){

        Users user = new Users();
        user.setUserName(request.getParameter("username"));
        user.setPassword(request.getParameter("psw"));
        user.setGender(Integer.parseInt(request.getParameter("gender")));
        user.setProfessionCode(request.getParameter("pro_code"));
        user.setProfessionName(request.getParameter("pro_name"));
        user.setMobileNum(request.getParameter("mobileNum"));
        user.setId(UUID.randomUUID().toString());
        user.setUserId(UUID.randomUUID().toString());
        if(user.getUserName() != null && user.getPassword() != null){
            userService.insert(user);
        }else{
            return "注册失败";
        }
        return "注册成功";
    }

    /**
     * 登录
     * @param request
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @Transactional(rollbackFor = RuntimeException.class)
    public @ResponseBody String login(HttpServletRequest request){

        Users user = new Users();
        Map<String,Object> condi = new HashMap<>();
        condi.put("userName",request.getParameter("username").toLowerCase());
        condi.put("mobileNum",request.getParameter("mobileNum"));
        condi.put("password",request.getParameter("psw").toLowerCase());
        user = userService.selectByUsername(condi);
        if(user == null) {
            return "用户名或密码错误,请重试";
        }
        return "登录成功";
    }

}
