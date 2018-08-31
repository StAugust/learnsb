package cn.augusto.spdemo.services;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 14:43 2018/7/3
 */
public class UsePureService {
  private PureService service;
  
  public PureService getService() {
    return service;
  }
  
  public void setService(PureService service) {
    this.service = service;
  }
  
  public void printInfo(){
    System.out.println(this.getClass().getCanonicalName() + "." + this.hashCode() + " -> ");
    service.sayHello(this.getClass().getCanonicalName() + "." + this.hashCode() + " -> ");
  }
}
