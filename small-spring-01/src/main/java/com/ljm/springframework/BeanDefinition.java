package com.ljm.springframework;

/**
 * @Auther: liangjm
 * @Date: 2022/11/18
 * @Description:
 * @Version: 1.0
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean){
        this.bean = bean;
    }

    public Object getBean(){
        return bean;
    }

}
