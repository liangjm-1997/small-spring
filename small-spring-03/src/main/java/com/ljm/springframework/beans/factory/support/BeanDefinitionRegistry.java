package ljm.springframework.beans.factory.support;

import ljm.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    /**
     * 注册beanDefinition
     */
    void registryBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
