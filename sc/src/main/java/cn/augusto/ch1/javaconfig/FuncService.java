package cn.augusto.ch1.javaconfig;


public class FuncService {
  String prefix = "Hello";

  FuncService(){

  }
  FuncService(String prefix){
    this.prefix = prefix;
  }
  public String sayHello(String word){
    return prefix + " " + word;
  }
}
