package cn.facilityone.controller;


import cn.facilityone.common.captcha.constant.CaptchaConstant;
import cn.facilityone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    public String doLogin(
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        String captcha = request.getParameter("Captcha");
        String exitCode = (String) request.getSession().getAttribute(CaptchaConstant.KEY_CAPTCHA);
        if (null != captcha && captcha.equalsIgnoreCase(exitCode)) {
            System.out.println("ok");
        }
        return "test";
    }
}
