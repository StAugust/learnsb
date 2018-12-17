package cn.augusto.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class DemoProtoTypeService {

  static int x = 0;
  public DemoProtoTypeService(){
    x+= 1;
  }

  public String echo(String word){
    return ("" + x + " -> " + word);
  }
}
