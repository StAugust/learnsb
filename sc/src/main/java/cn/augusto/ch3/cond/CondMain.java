package cn.augusto.ch3.cond;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import scala.collection.immutable.List;

public class CondMain {
  public static void main(String[] args){
    AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(CondConfig.class);

    ListService ls = context.getBean(ListService.class);
    System.out.println(ls.showListCommand());
    context.close();
  }
}
