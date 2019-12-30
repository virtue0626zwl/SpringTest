/**
 * @projectName demo
 * @package com.thunisoft.testSpring.demo.exception
 * @className NoDataException
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.test.demo.exception;
/**
 * NoDataException
 *
 * @description 没有数据异常
 * @author zouweilin
 * @date 2019/12/19 18:18
 * @version TODO
 */
public class NoDataException extends RuntimeException{

    public NoDataException(String message) {
        super(message);
    }


    public NoDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
