package cn.augusto.ch3.pool;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class AsyncMain {
  public static void main(String[] args){
    AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(PoolConfig.class);

    AsyncService as = context.getBean(AsyncService.class);
    for(int i= 0; i != 7; i++){
      try {
        as.tick(i);
      }catch (Exception e){
        e.printStackTrace();
      }
    }

    for(int i = 0; i != 14; i++){
      try {
        as.nextTick(i);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    context.stop();
    context.close();
  }
}
