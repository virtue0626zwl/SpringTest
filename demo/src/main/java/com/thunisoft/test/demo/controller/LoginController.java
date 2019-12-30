/**
 * @projectName demo
 * @package com.thunisoft.testSpring.demo.controller
 * @className LoginController
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.test.demo.controller;

import com.thunisoft.test.demo.exception.NoDataException;
import com.thunisoft.test.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * LoginController
 *
 * @description TODO
 * @author zouweilin
 * @date 2019/12/19 17:05
 * @version TODO
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public Object login(String loginId,String password) {
        if(Objects.isNull(loginService.login(loginId,password))){
            throw new NoDataException("用户信息有误，登陆失败");
        }
        return "登录成功";
    }
}
