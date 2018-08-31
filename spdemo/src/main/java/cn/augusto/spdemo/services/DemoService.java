package cn.augusto.spdemo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 19:23 2018/7/3
 */
@Service
public class DemoService {
  @Value("Properties from other class")
  private String another;
  
  public String getAnother(){
    return another;
  }
  
  public void setAnother(String a){
    another = a;
  }
}
