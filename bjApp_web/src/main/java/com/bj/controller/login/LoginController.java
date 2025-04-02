package com.bj.controller.login;

import com.bj.service.login.LoginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Demo class
 * @author linchuanpao
 * @date 2016/10/31
 */
@RestController
public class LoginController {
    @Resource
    private LoginService loginService;

    @RequestMapping("/login")
    public Object req(){
        return loginService.login();
    }
}
