package com.spring.core;

/**
 * @author wuyue
 * @data 2016/6/10
 */
public class UserServiceImpl implements UserService {
    public UserServiceImpl(){}

    public boolean personDo(UserInfo userInfo) {
        String username = userInfo.getUsername();
        String password = userInfo.getPassword();
        if (username.equals("wuyue")&&password.equals("11111")){
            return  true;
        }
        else return false;


    }
}
