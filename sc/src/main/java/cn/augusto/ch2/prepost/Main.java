package cn.augusto.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args){
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    BeanService bs = context.getBean(BeanService.class);
    JsrService js = context.getBean(JsrService.class);

    context.close();
  }

}
