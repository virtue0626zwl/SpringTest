/**
 * @projectName demo
 * @package com.thunisoft.testSpring.demo.service
 * @className LoginService
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * LoginService
 *
 * @description TODO
 * @author zouweilin
 * @date 2019/12/19 17:11
 * @version TODO
 */
@Service
public class LoginService {

    @Autowired
    private UserService userService;

    public Object login(String loginId,String password){
        return userService.getUser(loginId,password);
    }
}
