package cn.augusto.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
  @Value("other class's attr")
  private String another;

  public String getAnother(){
    return another;
  }

  public void setAnother(String a){
    another = a;
  }

}
