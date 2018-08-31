package cn.augusto.spdemo.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 19:42 2018/7/3
 */
public class JsrWayService {
  @PostConstruct
  public void init(){
    System.out.println(this.getClass().getCanonicalName() + " init");
  }
 
  public JsrWayService(){
    super();
    System.out.println(this.getClass().getCanonicalName() + " constructor");
  }
  @PreDestroy
  public void destroy22(){
    System.out.println(this.getClass().getCanonicalName() + " destroy");
  }
  
  
}
