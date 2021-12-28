package com.liam.taco3.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description
 * @Author liam661
 * @Date 2021/12/26 11:14
 **/
@Controller
public class RouterController {

    @GetMapping("/index123")
    public String index() {
        return "index";
    }
}
