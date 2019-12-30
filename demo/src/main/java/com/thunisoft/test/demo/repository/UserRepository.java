/**
 * @projectName demo
 * @package com.thunisoft.testSpring.demo.repository
 * @className com.thunisoft.testSpring.demo.repository.LoginRepository
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.test.demo.repository;

import com.thunisoft.test.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * LoginRepository
 *
 * @description 用户Repository
 * @author zouweilin
 * @date 2019/12/19 17:16
 * @version v1.0
 */
public interface UserRepository extends JpaRepository<User, String> {

    /**
     * UserRepository
     *
     * @description 通过用户名和密码获取用户
     * @param loginId 用户名Id
     * @param password  密码
     * @author zouweilin
     * @date 2019/12/19 17:55
     * @version v1.0
     **/
    User findByLoginIdAndPassWord(String loginId, String password);

}
