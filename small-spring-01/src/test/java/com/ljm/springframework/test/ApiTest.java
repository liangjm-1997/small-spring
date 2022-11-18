package com.ljm.springframework.test;

import com.ljm.springframework.BeanDefinition;
import com.ljm.springframework.BeanFactory;
import com.ljm.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @Auther: liangjm
 * @Date: 2022/11/18
 * @Description:
 * @Version: 1.0
 */
public class ApiTest {
    @Test
    public void  test1(){
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBeanDefinition("userService",beanDefinition);
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

    }

}
