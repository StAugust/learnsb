package cn.augusto.spdemo;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 13:47 2018/7/3
 */
public class HelloWord {
  private String name;
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void sayHello(){
    System.out.println(name);
  }
  
}
