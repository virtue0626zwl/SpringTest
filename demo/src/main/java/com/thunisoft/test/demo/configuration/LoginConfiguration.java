/**
 * @projectName demo
 * @package com.thunisoft.test.demo.configuration
 * @className com.thunisoft.test.demo.configuration.LoginConfiguration
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.test.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * LoginConfiguration
 *
 * @description 登陆拦截器注册
 * @author zouweilin
 * @date 2019/12/30 16:53
 * @version TODO
 */
@Configuration
public class LoginConfiguration implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截器注册
//        InterceptorRegistration registration = registry.addInterceptor(new LoginIntercepter());
        //所有路径都被拦截
//        registration.addPathPatterns("/**");
        //添加不拦截路径
//        registration.excludePathPatterns("/static/**","/login");
    }
}
