package com.liam.taco3.cotroller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author liam661
 * @Date 2021/12/27 10:51
 **/
@Controller
public class UserController {
    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Hello I'm TyCoding, this is Login test";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/info")
    @ResponseBody
    public Object getCurrentUser(Authentication authentication) {
        return authentication;
    }
}
