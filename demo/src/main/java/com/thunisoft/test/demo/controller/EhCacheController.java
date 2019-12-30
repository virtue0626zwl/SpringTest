/**
 * @projectName demo
 * @package com.thunisoft.test.demo.controller
 * @className com.thunisoft.test.demo.controller.EhCacheController
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.test.demo.controller;

import com.thunisoft.test.demo.repository.UserRepository;
import com.thunisoft.test.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EhCacheController
 *
 * @description TODO
 * @author zouweilin
 * @date 2019/12/30 10:22
 * @version TODO
 */
@RestController
public class EhCacheController {

    private static final Logger logger = LoggerFactory.getLogger(EhCacheController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/ehcache")
    public String EhcacheTest(){
        logger.debug("进行Encache缓存测试");
        System.out.println("====查询用户====");

        System.out.println(userRepository.findById("52bf869ef8484d048faa7a6558ab2463"));
        System.out.println("====缓存查询用户====");
        System.out.println(userService.getUserById("52bf869ef8484d048faa7a6558ab2463"));

        return "success";
    }
}

