package cn.augusto.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
  @Action(name="annotation add -> ")
  public void add(){
    System.out.println(this.getClass().getCanonicalName() + ".add");
  }
}
