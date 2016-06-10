package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author wuyue
 * @data 2016/6/10
 */
public class UserServiceDo {
    public UserServiceDo(){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/applicationContext.xml");
        UserService userServiceImpl = (UserService)ctx.getBean("userServiceImpl");
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("wuyue");
        userInfo.setPassword("11111");
        boolean flasg = userServiceImpl.personDo(userInfo);
        System.out.print(flasg);
    }
   public static void main(String[] args){
       new UserServiceDo();
   }

}
