package com.qworldr.webstatistics.log.controller;

import com.qworldr.domain.User;
import com.qworldr.webstatistics.service.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wujiazhen on 2018/1/6.
 */
@RestController
public class LogController implements LogService {
    Logger logger=  LoggerFactory.getLogger(LogController.class);

    @Override
    public String test() {
        logger.info("this server response......................");
        return "log........................";
    }

    @Override
    public User testById(@PathVariable(name = "username") String username) {
        logger.info("this server response......................");
        User user = new User();
        user.setUsername(username);
        return user;
    }
}
