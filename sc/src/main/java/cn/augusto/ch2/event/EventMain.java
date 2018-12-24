package cn.augusto.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventMain {
  public static void main(String[] args){
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

    context.getBean(EventPublisher.class).newEvent("qunidayede");

    context.close();

  }
}
