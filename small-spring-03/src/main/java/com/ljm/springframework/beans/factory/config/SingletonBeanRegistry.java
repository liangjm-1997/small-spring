package ljm.springframework.beans.factory.config;

import ljm.springframework.beans.BeansException;

public interface SingletonBeanRegistry {
    public Object getSingleton(String beanName) throws BeansException;
}
