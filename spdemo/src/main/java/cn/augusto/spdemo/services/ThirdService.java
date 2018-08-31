package cn.augusto.spdemo.services;

import org.springframework.stereotype.Component;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 17:05 2018/7/3
 */
@Component
public class ThirdService {
  
  private UsePureService svc;
  
  public ThirdService(UsePureService service) {
    this.svc = service;
  }
  
  public void printInfo(){
    System.out.println(this.getClass().getCanonicalName() + "." + this.hashCode() + " --> ");
    svc.printInfo();
    
  }
}
