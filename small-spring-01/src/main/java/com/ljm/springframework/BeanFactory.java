package com.ljm.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: liangjm
 * @Date: 2022/11/18
 * @Description:
 * @Version: 1.0
 */
public class BeanFactory {
    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name,BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name,beanDefinition);
    }
}
