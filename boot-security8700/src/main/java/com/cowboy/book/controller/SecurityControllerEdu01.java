package com.cowboy.book.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Tangyinbo
 * @Date: 2018/11/19 16:51
 * @Description:
 */
@RestController
public class SecurityControllerEdu01 {
    @RequestMapping("/hi")
    public Authentication sayHi() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
