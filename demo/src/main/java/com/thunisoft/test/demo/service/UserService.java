/**
 * @projectName demo
 * @package com.thunisoft.testSpring.demo.service
 * @className UserService
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.test.demo.service;

import com.thunisoft.test.demo.entity.User;
import com.thunisoft.test.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * UserService
 *
 * @description 用户实现类
 * @author zouweilin
 * @date 2019/12/19 17:34
 * @version TODO
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Cacheable(value = "use", key = "#loginId")
    public User getUser(String loginId,String password) {
        return userRepository.findByLoginIdAndPassWord(loginId, password);
    }

    @Cacheable(value = "use", key = "#id")
    public Optional<User> getUserById(String id){
        return userRepository.findById(id);
    }
}
