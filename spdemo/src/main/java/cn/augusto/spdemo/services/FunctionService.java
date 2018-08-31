package cn.augusto.spdemo.services;

import org.springframework.stereotype.Service;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 14:21 2018/7/3
 */
@Service
public class FunctionService {
  public String sayHello(String world){
    return "Hi, "+this.getClass().getCanonicalName() + "." + this.hashCode() + " --> " + world;
  }
  
}
