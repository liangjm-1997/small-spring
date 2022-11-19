package com.ljm.springframework.beans.factory.support;

import com.ljm.springframework.beans.BeansException;
import com.ljm.springframework.beans.factory.BeanFactory;
import com.ljm.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{
    private Map<String,BeanDefinition> beanDefinitionMap = new HashMap<>();
    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if ( null == beanDefinition ) throw new BeansException("No bean named " + beanName + " is defined");
        return beanDefinition;
    }


    @Override
    public void registryBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName,beanDefinition);
    }
}
