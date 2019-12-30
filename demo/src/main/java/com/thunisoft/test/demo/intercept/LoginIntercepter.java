/**
 * @projectName demo
 * @package com.thunisoft.test.demo.intercept
 * @className com.thunisoft.test.demo.intercept.LoginIntercepter
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.test.demo.intercept;

import com.thunisoft.test.demo.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * LoginIntercepter
 *
 * @description 登录拦截
 * @author zouweilin
 * @date 2019/12/30 16:34
 * @version TODO
 */
public class LoginIntercepter implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoginIntercepter.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {
        User user = (User)request.getSession().getAttribute("user");
        if (Objects.isNull(user)) {
            response.sendRedirect("/success");
            return false;
        }
        return true;
    }
}
