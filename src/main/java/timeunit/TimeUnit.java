package timeunit;


class Idle implements Runnable {
  @Override
  public void run() {
    int i = 0;
    while (true) {
//      Thread.yield();
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      i++;
    }
  }
}

class Busy implements Runnable {
  @Override
  public void run() {
    int i = 0;
    while (true) {
      i++;
    }
  }
}


public class TimeUnit {
  public static void main(String[] args) {
    Thread[] busyThread = new Thread[1];
    Thread[] idleThread = new Thread[80];
    for (int i = 0; i != idleThread.length; i++) {
      idleThread[i] = new Thread(new Idle());
      idleThread[i].setPriority(Thread.MAX_PRIORITY);
    }
    for (int i = 0; i != busyThread.length; i++) {
      busyThread[i] = new Thread(new Busy());
      busyThread[i].setPriority(Thread.MIN_PRIORITY);
    }
    for(int i = 0; i != idleThread.length; i++){
      idleThread[i].start();
    }
    for(int i = 0; i != busyThread.length; i++){
      busyThread[i].start();
    }
    while(true){
      try {
        Thread.sleep(1000 * 1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
