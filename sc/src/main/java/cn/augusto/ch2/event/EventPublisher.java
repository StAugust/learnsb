package cn.augusto.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {
  @Autowired
  ApplicationContext context;

  public void newEvent(String msg){
    context.publishEvent(new DemoEvent(this, msg));
  }
}
