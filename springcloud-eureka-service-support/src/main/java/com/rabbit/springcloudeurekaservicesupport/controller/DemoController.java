package com.rabbit.springcloudeurekaservicesupport.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NaJim
 * date 2021-11-11
 * 作为服务提供，有个controller提供个接口，很合理吧，没什么问题吧？
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/hello")
    public Map<String, String> hello(String msg) {
        Map<String, String> result = new HashMap<>();
        result.put("code", "200");
        result.put("msg", msg);
        return result;
    }
}
