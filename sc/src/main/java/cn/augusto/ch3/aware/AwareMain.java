package cn.augusto.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareMain {
  public static void main(String[] args){
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
    AwareService as = context.getBean(AwareService.class);
    as.showInfo();
    context.close();
  }
}


