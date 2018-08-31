package cn.augusto.spdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 14:22 2018/7/3
 */
@Service
//@Scope("prototype")
public class UserFuncService {
  public UserFuncService(){
    System.out.println(this.getClass().getCanonicalName());
  }
  @Autowired
  private FunctionService service;
  public String sayHello(String word){
    return service.sayHello(this.getClass().getCanonicalName() + "." + this.hashCode() + " -> " + word);
  }
}
