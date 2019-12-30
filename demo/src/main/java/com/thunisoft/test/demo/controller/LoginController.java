/**
 * @projectName demo
 * @package com.thunisoft.testSpring.demo.controller
 * @className LoginController
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.test.demo.controller;

import com.thunisoft.test.demo.entity.User;
import com.thunisoft.test.demo.exception.NoDataException;
import com.thunisoft.test.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * LoginController
 *
 * @description 登陆入口方法
 * @author zouweilin
 * @date 2019/12/19 17:05
 * @version v1.0
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public Object login(String loginId,@RequestParam String password) {
        HttpServletRequest request
            = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        User user = loginService.login(loginId,password);
        if(Objects.isNull(loginService.login(loginId,password))){
            throw new NoDataException("用户信息有误，登陆失败");
        }
        request.getSession().setAttribute("user", user);
        return "登录成功";
    }
}
