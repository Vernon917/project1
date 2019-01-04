package cn.demo.controller;

import cn.demo.service.LoginCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LoginController {
    @Autowired
    public LoginCheck loginCheck;

    @RequestMapping("/login")
    public String logincheck(String name, String pwd) {
        boolean b = loginCheck.login(name, pwd);
        if (b)
            return "success";
        else
            return "failed";
    }


    @RequestMapping("/turntologin")
    public String turntologin() {
        return "loginjsp";
    }
}
