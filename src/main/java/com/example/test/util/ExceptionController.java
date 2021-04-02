package com.example.test.util;

import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.AuthenticationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @ProjectName: shiro-jwt
 * @Package: com.example.shirojwt.utils
 * @ClassName: ExceptionController
 * @Author: jibl
 * @Description:@RestControllerAdvice都是对Controller进行增强的，可以全局捕获spring mvc抛的异常。
 * @Date: 2021/4/1 10:43
 * @Version: 1.0
 */
@RestControllerAdvice
public class ExceptionController {

    // 捕捉shiro的异常
    @ExceptionHandler(ShiroException.class)
    public Result handle401() {
        return Result.ok("抱歉，您没有权限访问！");
    }


    // 捕捉其他所有异常
    @ExceptionHandler(Exception.class)
    public Result globalException(HttpServletRequest request, Throwable ex) {
        return Result.ok("访问出错，无法访问: " + ex.getMessage());
    }

}
