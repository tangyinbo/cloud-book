package com.cowboy.book.controlle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Tangyinbo
 * @Date: 2018/11/19 10:55
 * @Description:
 */
@RestController
public class ConfigEduController {
    //@Value("${name}")
    private String name;

    @RequestMapping("/getName")
    public String getName() {
        return "hello:"+name;
    }
}
