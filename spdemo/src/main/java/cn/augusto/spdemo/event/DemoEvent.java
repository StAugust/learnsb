package cn.augusto.spdemo.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 9:42 2018/7/4
 */
public class DemoEvent extends ApplicationEvent {
  private static final long serialVersionUID = 1L;
  private String msg;
  
  public DemoEvent(Object source, String msg) {
    super(source);
    this.msg = msg;
  }
  
  public String getMsg() {
    return msg;
  }
  
  public void setMsg(String msg) {
    this.msg = msg;
  }
}
