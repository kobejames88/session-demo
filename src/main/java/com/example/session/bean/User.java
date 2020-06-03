package com.example.session.bean;

/**
 * @Author:Lvxingqing
 * @Description:
 * @Date:Create in 10:43 2018/3/12
 * @Modified By:
 */
public class User {
    private String name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private  String password;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
