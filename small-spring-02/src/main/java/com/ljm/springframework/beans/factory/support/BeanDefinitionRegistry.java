package com.ljm.springframework.beans.factory.support;

import com.ljm.springframework.beans.factory.BeanFactory;
import com.ljm.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    public void registryBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
