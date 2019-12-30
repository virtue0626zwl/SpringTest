/**
 * @projectName demo
 * @package com.thunisoft.test.demo.advice
 * @className com.thunisoft.test.demo.advice.NoDataExceptionAdvice
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.test.demo.advice;

import com.thunisoft.test.demo.exception.NoDataException;
import com.thunisoft.test.demo.to.ResultBody;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * NoDataExceptionAdvice
 *
 * @description TODO
 * @author zouweilin
 * @date 2019/12/19 18:31
 * @version TODO
 */
@ControllerAdvice
@Slf4j
public class NoDataExceptionAdvice {

    private static final Logger logger = LoggerFactory.getLogger(NoDataExceptionAdvice.class);

    @ExceptionHandler(NoDataException.class)
    public ResultBody noDataExceptionHandler(HttpServletRequest req, NoDataException e){
        logger.error("用户信息有误",e.getMessage());
        return ResultBody.error(HttpStatus.NO_CONTENT.name(),e.getMessage());
    }
}
