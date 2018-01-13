package com.qworldr.webstatistics.controller;

import com.qworldr.webstatistics.service.LogServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wujiazhen on 2018/1/6.
 */
@RestController
@RefreshScope
public class TestController {
    @Autowired
    public LogServiceFeign logService;
    @Value("${test}")
    public String test;

    @RequestMapping("/test")

    public String  test(){
      return logService.test();
    }
    @RequestMapping("/testConfig")
    public String config(){
        return  test;
    }

    @RequestMapping("/testById/{id}")
     public String  testById(@PathVariable String id){
        logService.testById(id);
        return logService.testById(id).getUsername();
    }

}
