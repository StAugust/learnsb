package cn.augusto.ch3.pool;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
  @Async
  public void tick(Integer i) throws InterruptedException {
    for(int j = 0; j != 10; j++){
      System.out.println("" + i + " tick -> " + j);
      Thread.sleep(1000);
    }
  }

  @Async
  public void nextTick(Integer i) throws InterruptedException {
    for(int j = 0; j != 10; j++){
      System.out.println("" + i + " nexttick -> " + j);
      Thread.sleep(1000);
    }
  }


}
