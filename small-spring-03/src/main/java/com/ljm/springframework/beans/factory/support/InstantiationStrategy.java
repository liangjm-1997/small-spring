package ljm.springframework.beans.factory.support;

import ljm.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {
    Object instantiate(String beanName, BeanDefinition beanDefinition, Constructor constructor,Object[]args);
}
