/**
 * @projectName demo
 * @package com.thunisoft.testSpring.demo.controller
 * @className PageController
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PageController
 *
 * @description TODO
 * @author zouweilin
 * @date 2019/12/19 18:29
 * @version TODO
 */
@RestController
public class PageController {

    @GetMapping("/success")
    public String page() {
        return "success";
    }
}
