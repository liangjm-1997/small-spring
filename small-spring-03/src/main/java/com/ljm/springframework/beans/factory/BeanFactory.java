package ljm.springframework.beans.factory;

public interface BeanFactory {

    public Object getBean(String beanName);

    /**
     * 带入参的构造
     * @param beanName
     * @param args
     * @return
     */
    public Object getBean(String beanName,Object... args);


}
