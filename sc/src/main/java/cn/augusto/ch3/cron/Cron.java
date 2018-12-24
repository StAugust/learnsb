package cn.augusto.ch3.cron;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cron {
  public static void main(String[] args){
    AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(CronConfig.class);

    context.close();
  }
}
