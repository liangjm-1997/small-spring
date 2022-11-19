package com.ljm.springframework.beans.factory.support;

import com.ljm.springframework.beans.BeansException;
import com.ljm.springframework.beans.factory.BeanFactory;
import com.ljm.springframework.beans.factory.config.BeanDefinition;

/**
 * 抽象类定义模板方法(AbstractBeanFactory)
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory{

    @Override
    public Object getBean(String beanName)throws BeansException {
        //继承了DefaultSingletonBeanRegistry 获取了单例注册类方法。
        Object bean = getSingleton(beanName);
        if ( bean != null ){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName,beanDefinition);
    }


    protected abstract BeanDefinition getBeanDefinition(String beanName)throws BeansException;


    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition) throws BeansException;




}
