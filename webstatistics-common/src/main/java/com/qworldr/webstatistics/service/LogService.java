package com.qworldr.webstatistics.service;

import com.qworldr.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wujiazhen on 2018/1/7.
 */

public interface LogService {
    @RequestMapping("/log")
    String test();
    @RequestMapping(value = "/logById/{username}",method = RequestMethod.GET)
    User testById(@PathVariable(name="username") String username);
}
