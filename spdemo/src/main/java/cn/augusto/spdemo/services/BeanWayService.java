package cn.augusto.spdemo.services;

import org.springframework.stereotype.Service;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 19:40 2018/7/3
 */
public class BeanWayService {
  public void init(){
    System.out.println(this.getClass().getCanonicalName() + " init");
  }
  
  public BeanWayService(){
    super();
    System.out.println(this.getClass().getCanonicalName() + " constructor");
  }
  
  public void destroy(){
    System.out.println(this.getClass().getCanonicalName() + " destroy");
  }
}
