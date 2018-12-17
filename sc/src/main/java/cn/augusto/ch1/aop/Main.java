package cn.augusto.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args){
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
    DemoAnnotationService das = context.getBean(DemoAnnotationService.class);
    DemoMethodService dms = context.getBean(DemoMethodService.class);
    das.add();
    dms.add();
    context.close();
  }
}
