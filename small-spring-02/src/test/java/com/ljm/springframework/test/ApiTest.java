package com.ljm.springframework.test;

import com.ljm.springframework.beans.factory.config.BeanDefinition;
import com.ljm.springframework.beans.factory.support.DefaultListableBeanFactory;
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
    public void  test_BeanFactory(){

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();


        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);

        beanFactory.registryBeanDefinition("userService",beanDefinition);


        UserService userService = (UserService) beanFactory.getBean("userService");


        userService.queryUserInfo();


    }

}
