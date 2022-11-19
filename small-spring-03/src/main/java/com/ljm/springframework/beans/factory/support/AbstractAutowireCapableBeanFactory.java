package ljm.springframework.beans.factory.support;

import ljm.springframework.beans.BeansException;
import ljm.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    InstantiationStrategy instantiationStrategy = new CglibSubClassingInstantiationStrategy();
    @Override
    protected Object creteBean(String beanName, BeanDefinition beanDefinition, Object[] args) {
        Object bean = null;
        try {
            bean = createBeanInstance(beanName,beanDefinition,args);
        }catch (Exception e){
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName,bean);
        return bean;
    }

    protected Object createBeanInstance(String beanName,BeanDefinition beanDefinition, Object[] args){
        Constructor ctor = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors){
            if ( constructor != null && constructor.getParameterTypes().length == args.length){
                ctor =  constructor;
                break;
            }
        }
        return instantiationStrategy.instantiate(beanName,beanDefinition,ctor,args);

    }

}
