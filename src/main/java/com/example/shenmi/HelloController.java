package com.example.shenmi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yang ShengYuan
 * @date 2019/5/18
 * @Description ${DESCRIBE}
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring B +++NMSL++++oot!?fxvxf???";
    }
    @RequestMapping("/fuckYou")
    public String fuck(){
        return "Fucking yourself!";
    }
}
