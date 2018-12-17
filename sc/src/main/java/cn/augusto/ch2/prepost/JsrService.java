package cn.augusto.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JsrService {
  @PostConstruct
  public void init(){
    System.out.println(this.getClass().getCanonicalName() + " init ");
  }

  @PreDestroy
  public void des(){
    System.out.println(this.getClass().getCanonicalName() + "destroy");
  }

}
