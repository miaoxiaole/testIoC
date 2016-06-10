package com.spring.core;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author wuyue
 * @data 2016/6/10
 */
public class UserServiceImplTest extends TestCase {

    @Test
    public void test(){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/applicationContext.xml");
        UserService userServiceImpl = (UserService)ctx.getBean("userServiceImpl");
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("wuyue");
        userInfo.setPassword("11111");
        boolean flag = userServiceImpl.personDo(userInfo);
        Assert.assertEquals(flag,false);
    }

}
