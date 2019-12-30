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
 * @description 定义异常返回对象实体
 * @author zouweilin
 * @date 2019/12/28 17:50
 * @version v1.0
 */
@Data
public class ResultBody {

    private String code;

    private String message;

    private Object result;


    public static ResultBody error(String code, String message) {
        ResultBody resultBody = new ResultBody();
        resultBody.setCode(code);
        resultBody.setMessage(message);
        resultBody.setResult(null);
        return resultBody;
    }
}
