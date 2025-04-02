package com.bj.service.login;


import com.bj.dao.login.LoginDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class LoginService {

    @Resource
    public LoginDao loginDao;


    public Object login(){
        return loginDao.login();
    }
}
