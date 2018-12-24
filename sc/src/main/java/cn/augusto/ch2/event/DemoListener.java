package cn.augusto.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
  public void onApplicationEvent(DemoEvent event){
    String msg = event.getMsg();
    System.out.println(this.getClass().getCanonicalName() + " receive -> " + msg + " from -> " + event.getSource().getClass().getCanonicalName());
  }

}
