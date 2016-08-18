package cn.facilityone.controller;


import cn.facilityone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Yogi on 2016/7/20.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "login")
    public String view() {
        return "login";
    }

    @RequestMapping("/info/{id}")
    public String getUserInfo(
        @PathVariable("id") String id,
        HttpServletRequest request
    ) {
        return "test";
    }

    @RequestMapping(value = "index")
    public String doLogin() {
        return "test";
    }
}
