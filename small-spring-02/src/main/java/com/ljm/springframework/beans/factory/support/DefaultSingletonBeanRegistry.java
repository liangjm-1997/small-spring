package com.ljm.springframework.beans.factory.support;

import com.ljm.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String,Object> singleObjects = new HashMap<>();


    @Override
    public Object getSingleton(String beanName) {
        return singleObjects.get(beanName);
    }

    protected  void addSingleton(String beanName,Object object){
        singleObjects.put(beanName,object);
    }
}
