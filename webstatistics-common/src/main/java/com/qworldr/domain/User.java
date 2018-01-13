package com.qworldr.domain;

import java.io.Serializable;

/**
 * Created by wujiazhen on 2018/1/6.
 */
public class User implements Serializable{

    private String username;
    private String name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
