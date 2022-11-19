package ljm.springframework.beans.factory.support;

import ljm.springframework.beans.BeansException;
import ljm.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String,Object> singletons = new HashMap<>();
    @Override
    public Object getSingleton(String beanName) throws BeansException {
        return singletons.get(beanName);
    }

    public void addSingleton(String beanName,Object object){
        singletons.put(beanName,object);
    }
}
