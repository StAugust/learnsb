package cn.augusto.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class DemoSingletonService {

  static int x = 0;
  public DemoSingletonService(){
    x+= 1;
  }

  public String echo(String word){
    return ("" + x + " -> " + word);
  }
}
