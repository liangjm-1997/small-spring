package ljm.springframework.beans.factory.support;

import ljm.springframework.beans.factory.BeanFactory;
import ljm.springframework.beans.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {


    @Override
    public Object getBean(String beanName) {
        return null;
    }

    @Override
    public Object getBean(String beanName, Object... args) {
        Object bean = getSingleton(beanName);
        if ( bean != null ){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return creteBean(beanName,beanDefinition,args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object creteBean(String beanName,BeanDefinition beanDefinition,Object[] args);

}
