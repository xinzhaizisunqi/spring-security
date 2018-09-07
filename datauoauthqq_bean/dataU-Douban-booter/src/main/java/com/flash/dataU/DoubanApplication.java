package com.flash.dataU;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * dataU start Class.
 *
 * @author Flash (18811311416@sina.cn)
 * @since 2017-07-06 13:55
 */

//@SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
@SpringBootApplication
@Controller
public class DoubanApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoubanApplication.class,args);
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
