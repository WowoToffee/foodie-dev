package com.wowotoffer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author of
 * @version 1.0
 * @date 2022/2/27 18:39
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public Object hello(){
        return "hello world";
    }
}
