package cn.augusto.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] argv){
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
    UseFunctionService ufs = context.getBean(UseFunctionService.class);
    System.out.println(ufs.SayHello("augusto"));
    context.close();
  }
}
