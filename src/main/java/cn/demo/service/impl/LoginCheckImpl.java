package cn.demo.service.impl;

import cn.demo.service.LoginCheck;
import org.springframework.stereotype.Service;

@Service
public class LoginCheckImpl implements LoginCheck {
@Override
    public boolean login(String name,String psw){
        if(name.equals("123")&&psw.equals("123"))
            return true;
        else
            return false;
    }
}
