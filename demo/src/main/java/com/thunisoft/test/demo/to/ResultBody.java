/**
 * @projectName demo
 * @package com.thunisoft.test.demo.to
 * @className com.thunisoft.test.demo.to.ResultBody
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.test.demo.to;

import lombok.Data;

/**
 * ResultBody
 *
 * @description TODO
 * @author zouweilin
 * @date 2019/12/28 17:50
 * @version TODO
 */
@Data
public class ResultBody {

    private String code;

    private String message;

    private Object result;


    public static ResultBody error(String code, String message) {
        ResultBody rb = new ResultBody();
        rb.setCode(code);
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }
}
