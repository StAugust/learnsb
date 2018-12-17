package cn.augusto.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] argv){
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    UseFuncService ufs = context.getBean(UseFuncService.class);
    System.out.println(ufs.SayHello("haha"));
    context.close();
  }

}
