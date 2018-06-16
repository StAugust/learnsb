package cn.augusto;

import java.util.ArrayList;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 17:31 2018/6/7
 */
public class Login {
  private static String uRef;
  private static String pRef;
  
  public static void printUsr(String u, String p) {
    uRef = u;
    pRef = p;
    if (uRef.compareToIgnoreCase(pRef) != 0) {
      System.out.println(uRef + " : " + pRef);
    }
  }
  
  public static java.util.Random r = new java.util.Random(0xFF);
  
  public static String genStr() {
    String s = "";
    for(int i = 0; i<6; ++i)
      s += (char)('a' + r.nextInt(0xF));
    return s;
  }
  
  public static void main(String[] args) {
    
    java.util.List<Thread> thLst = new ArrayList<>();
    for(int i = 0; i != 100000; ++i){
      User u = new User(genStr());
      thLst.add(new Thread(u));
    }
    
    thLst.forEach(th -> {
      th.start();
    });
    
  }
}

class User implements Runnable {
  private String u;
  private String p;
  public User(String s){
    this.u = s;
    this.p = s;
  }
  @Override
  public void run() {
    Login.printUsr(u,p);
  }
}


class UserA implements Runnable {
  
  @Override
  public void run() {
    Login.printUsr("a", "aa");
  }
}

class UserB implements Runnable {
  
  @Override
  public void run() {
    Login.printUsr("b", "bb");
  }
}