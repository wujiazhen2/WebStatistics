package com.qworldr.webstatistics.service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by wujiazhen on 2018/1/8.
 */
@FeignClient("log-service")
public interface LogServiceFeign extends LogService {
}
