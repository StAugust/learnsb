package cn.augusto.ch3.annos;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AMain {
  public static void main(String[] args){
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnoConfig.class);
    context.getBean(Service.class).showInfo();
    context.close();
  }
}
