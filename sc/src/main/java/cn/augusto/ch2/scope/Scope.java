package cn.augusto.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Scope {
  public static void main(String[] args){
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

    for(int i = 0; i != 10; i++) {
      DemoSingletonService dss = context.getBean(DemoSingletonService.class);
      System.out.println(dss.echo("nidaye"));
    }


    for(int i = 0; i != 10; i++) {
      DemoProtoTypeService dss = context.getBean(DemoProtoTypeService.class);
      System.out.println(dss.echo("nidaye"));
    }

    context.close();
  }
}
