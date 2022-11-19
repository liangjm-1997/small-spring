package com.ljm.springframework.beans.factory.support;

import com.ljm.springframework.beans.BeansException;
import com.ljm.springframework.beans.factory.config.BeanDefinition;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    public Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        }catch (Exception e){
            throw new BeansException("Instantiation of bean failed", e);
        }
        //添加到单例中去
        addSingleton(beanName,beanDefinition);
        return bean;
    }
}
