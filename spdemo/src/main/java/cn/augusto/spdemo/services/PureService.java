package cn.augusto.spdemo.services;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 14:41 2018/7/3
 */
public class PureService {
  public void sayHello(String hello){
    System.out.println("Hi, "+this.getClass().getCanonicalName() + "." + this.hashCode() + " --> " + hello);
  }
}
