package cn.augusto.ch3.annos;

import org.springframework.stereotype.Component;

@Component
public class Service {
  public void showInfo(){
    System.out.println(this.getClass().getCanonicalName());
  }
}
