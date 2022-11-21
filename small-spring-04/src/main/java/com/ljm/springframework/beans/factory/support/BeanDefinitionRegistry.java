package ljm.springframework.beans.factory.support;

import ljm.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    public void registryBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
