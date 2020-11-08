package com.xm.entity;

import lombok.Data;

@Data
public class SysUser {

    private Integer id;

    private String usercode;

    private String username;

    private String password;

    private String salt;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getId() {
        return id;
    }

    public String getUsercode() {
        return usercode;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }
}
