package cn.augusto.spdemo.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 9:44 2018/7/4
 */
@Component
public class DemoPublisher {
  @Autowired
  ApplicationContext context;
  
  public void publish(String msg) {
    context.publishEvent(new DemoEvent(this, msg));
  }
}
