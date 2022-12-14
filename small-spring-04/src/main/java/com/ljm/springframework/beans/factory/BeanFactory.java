package ljm.springframework.beans.factory;

import ljm.springframework.beans.BeansException;

public interface BeanFactory {
    Object getBean(String beanName) throws BeansException;
    Object getBean(String beanName,Object... args) throws BeansException;


}
