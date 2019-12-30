/**
 * @projectName demo
 * @package com.thunisoft.testSpring.demo.entity
 * @className com.thunisoft.testSpring.demo.entity.entity
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.test.demo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * entity
 *
 * @description 用户entity
 * @author zouweilin
 * @date 2019/12/19 17:25
 * @version v1.0
 */
@Entity
@Table(name = "t_user", schema = "db_zwl")
@Data
public class User implements Serializable {

    @Column(name = "c_id")
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    private String id;

    @Column(name = "c_login_id")
    private String loginId;

    @Column(name = "c_username")
    private String userName;

    @Column(name = "c_password")
    private String passWord;

    @Column(name = "dt_create_time")
    @CreatedDate
    private LocalDateTime createTime;

    @Column(name = "dt_update_time")
    @LastModifiedDate
    private LocalDateTime updateTime;

    @Column(name = "c_create_user")
    private String createUser;

    @Column(name = "c_update_user")
    private String updateUser;
}
