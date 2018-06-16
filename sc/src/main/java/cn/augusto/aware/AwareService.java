package cn.augusto.aware;

import org.codehaus.plexus.util.IOUtil;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 14:57 2018/6/14
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware{
  private String beanName;
  private ResourceLoader loader;
  
  @Override
  public void setResourceLoader(ResourceLoader resourceLoader) {
    this.loader = resourceLoader;
  }
  
  @Override
  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }
  public void outputResult(){
    System.out.println("Bean's name is " + beanName);
    Resource resource = loader.getResource("classpath:cn/augusto/aware/conf.txt");
    try {
      System.out.println("Resource loader -> " + IOUtil.toString(resource.getInputStream()));
    }
    catch (Exception e){
      e.printStackTrace();
    }
  }
  
}
