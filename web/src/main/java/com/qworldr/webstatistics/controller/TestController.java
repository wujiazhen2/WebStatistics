package com.qworldr.webstatistics.controller;

import com.qworldr.webstatistics.service.LogServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wujiazhen on 2018/1/6.
 */
@RestController
public class TestController {
    @Autowired
    public LogServiceFeign logService;

    @RequestMapping("/test")

    public String  test(){
      return logService.test();
    }


    @RequestMapping("/testById/{id}")
     public String  testById(@PathVariable String id){
        logService.testById(id);
        return logService.testById(id).getUsername();
    }

}
