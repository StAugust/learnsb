package cn.augusto.spdemo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 9:43 2018/7/4
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
  public void onApplicationEvent(DemoEvent event){
    String msg = event.getMsg();
    System.out.println(this.getClass().getCanonicalName() + " recieve msg -> " + msg);
  }
}
