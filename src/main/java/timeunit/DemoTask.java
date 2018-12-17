package timeunit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoTask implements Runnable {

  private String name;

  public DemoTask(String name) {

    this.name = name;

  }

  @Override

  public void run() {

    double  j=0.0;

//sin的最小周期为2π

    for(j=0.0;j<8*2*Math.PI;j+=0.1){

//500毫秒为时间间隔

      compute(500,Math.sin(j)/2+0.5);

    }

  }

  private void compute(int time, double percent) {

    long runTime = (long)(time*percent);

    long sleepTime = time - runTime;

    long startTime =System.currentTimeMillis();

    while(System.currentTimeMillis()-startTime<runTime)

    {

      ;

    }

    try {

      Thread.sleep(sleepTime);

    } catch (InterruptedException e) {

      e.printStackTrace();

    }

  }


  public static void main(String[] args) {

//获取系统CPU的核数

    int cpuNum = Runtime.getRuntime().availableProcessors();

    ExecutorService threadPool = Executors.newFixedThreadPool(cpuNum);

    for(int i =0;i<cpuNum;i++)

    {

      threadPool.execute(new DemoTask("Task-"+i));

    }

  }

}